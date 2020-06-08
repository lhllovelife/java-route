package CourseTest;

import java.io.*;
import java.lang.reflect.Field;

/*
目的：拷贝目录

第一次目前程序中的bug:(已经解决)
                如果copyAll函数运行过程中，未创建目录前，就已经出现一个文件需要读写，这时文件目录未创建，
                在new输出流对象的时候，会出现“系统找不到指定路径”
待实现：监测实时拷贝的比例，利用多线程。
 */
public class HomeWork01 {
    public static void main(String[] args) {
        //创建两个文件对象，一个源，一个目标
        //文件对象: 文件或路径的抽象表现形式
        File srcFile = new File("E:\\大学期间课程资料\\形式与政策\\");
        File descFile = new File("F:\\temp");
        copyAll(srcFile, descFile);
    }

    /**
     * 拷贝目录
     * @param srcFile 拷贝源
     * @param descFile 拷贝目标
     */
    private static void copyAll(File srcFile, File descFile) {
        //如果该File对象是文件，则读取后写入到目标目录下。递归结束
        if(srcFile.isFile())
        {
            //如果该File对象是一个文件，则进行一边读、一边写。
            //创建字节输入流对象和字节输出流对象
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                //构造方法中传入一个File对象，创建字节输入流对象
                in = new FileInputStream(srcFile);
                String srcPath = srcFile.getAbsolutePath();
                String descPath = descFile.getAbsolutePath();
                //对源路径字符串裁剪得到 正确目标路径
                if(descPath.endsWith("\\"))
                {
                    descPath += srcPath.substring(3);
                }
                else descPath += "\\" + srcPath.substring(3);
                //创建字节输出流对象
                out = new FileOutputStream(descPath);
                System.out.println(descPath);
                //边读边写
                //准备一个byte[] 数组
                byte[] bytes = new byte[1024 * 1024]; // 1MB
                int readCount = 0;
                while ( (readCount = in.read(bytes)) != -1)
                {
                    //读多少、写多少
                    out.write(bytes, 0, readCount);
                }
                //刷新
                out.flush();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(in != null)
                {
                    try {
                        in.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(out != null)
                {
                    try {
                        out.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            return;
        }
        //建立目录
        if(srcFile.isDirectory())
        {
            String srcPath = srcFile.getAbsolutePath();
            String descPath = descFile.getAbsolutePath();
            //对源路径字符串裁剪得到 正确目标路径
            if(descPath.endsWith("\\"))
            {
                descPath += srcPath.substring(3);
            }
            else descPath += "\\" + srcPath.substring(3);
            File newFile = new File(descPath);
            if(!newFile.exists())
            {
                System.out.println("创建的目录：" + newFile.getName());
                //将路径以多重目录的形式创建出来
                newFile.mkdirs();
            }
        }
        //返回当前路径下所有的子文件
        //拿到当前srcFile的所有子对象(File类型)
        File[] files = srcFile.listFiles();
        for(File file : files)
        {
            //System.out.println(file.getAbsoluteFile());
            //如果该文件对象是一个目录，则在目标路径下创建相同的目录
            if (file.isDirectory())
            {
                //拿到源路径和目标路径
                String srcPath = file.getAbsolutePath();
                String descPath = descFile.getAbsolutePath();
                if(descPath.endsWith("\\"))
                {
                    descPath += srcPath.substring(3);
                }
                else descPath += "\\" + srcPath.substring(3);
//                System.out.println(srcPath);
//                System.out.println(descPath);
                File descDire = new File(descPath); //通过路径名new一个File对象
                //如果该File对象不存在，则将目录创建出来
                if(!descDire.exists())
                {
                    System.out.println("循环中-创建目录(2)："+ descDire.getAbsolutePath());
                    //将路径以多重目录的形式创建出来
                    descDire.mkdirs();
                }
            }
            //递归调用
            copyAll(file, descFile);
        }
    }
}
