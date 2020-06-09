package Review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
1. 回顾FileInputStream 的一些方法。
读
 */
public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("IO流\\temp01.txt");
            System.out.println("文件读取中...");
            //读取数据

/*            //1. 每次读取一个字节
            int readData = 0;
            System.out.println("总共字节数：" + fis.available());
            while( (readData = fis.read()) != -1)
            {
                System.out.print("剩余可供读取的字节数：" + fis.available() + " ");
                System.out.println((char)readData);
            }
            System.out.println();
*/
            //2.每次读取一个byte数组
            System.out.println("剩余可供读取的字节数：" + fis.available());
            fis.skip(2); //跳过两个字节
            int readCount = 0;
            byte[] bytes = new byte[10];
            while ((readCount = fis.read(bytes)) != -1)
            {
                //读多少，打印多少.
                //通过构造方法，将byte[]数组转成一个String输出
                System.out.print(new String(bytes, 0, readCount));
            }
            System.out.println();
            System.out.println("剩余可供读取的字节数：" + fis.available());

        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
//            System.out.println("finally语句块执行");
            //文件使用完之后，需要手动关闭
            //finally语句块是最终一定会执行的语句块
            if(fis != null)
            {
                try
                {
                    fis.close();
                    System.out.println("文件成功关闭");
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
