package Review;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;

/*
java.io.File 类的方法练习
 */
public class FileTest {
    public static void main(String[] args) {
        //File对象表示：文件或目录的抽象表示形式
        File f = new File("E:\\B站学习\\java-route\\JavaSE(老杜)\\ProjectSets\\javase进阶\\IO流");
        //判断该对象是一个目录还是一个文件
        System.out.println("该File对象是：" + (f.isDirectory() ? "目录" : "文件"));
        System.out.println("该File对象是：" + (f.isFile() ? "文件" : "目录"));
        //获取该目录下的所有子文件
        File[] files = f.listFiles();
        System.out.println(files.length);
        for (File file : files)
        {
            if(file.isDirectory()) System.out.println("目录名 " + file.getName());
            if(file.isFile()) System.out.println("文件名 " + file.getName());
        }
        File f1 = new File("E:\\B站学习\\java-route\\JavaSE(老杜)\\ProjectSets\\javase进阶\\IO流\\test08.txt");
        if (!f1.exists())
        {
            System.out.println("该文件不存在");
            System.out.println("创建中---");
            try {
                if (f1.createNewFile()) System.out.println("创建成功！ 文件名：" + f1.getName());
            }
            catch (IOException e) {


            }
        }
        File f2 = new File("E:\\B站学习\\java-route\\JavaSE(老杜)\\ProjectSets\\javase进阶\\IO流\\Code\\day01");
        if(!f2.exists())
        {
            System.out.println(f2.mkdirs() ? "创建成功" : "创建失败");
        }
    }
}
