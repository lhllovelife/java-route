package Review;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
1. 回顾FileOutputStream 的一些方法。
关乎写的一些操作
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try
        {
            fos = new FileOutputStream("IO流\\temp02.txt", true);
            System.out.println("正在写出数据...");
            //写数据
/*            //1. 一个字节一个字节的写
            fos.write(48);
            fos.write(49);
            fos.write(10);
            fos.write(50);
            fos.write(51);
*/
            //2. 每次输出一个byte[]数组
            String s0 = "I can have a job!";
            String s1 = "Now, I stay at Home";
            fos.write(s0.getBytes());
            fos.write(10);
            fos.write(s1.getBytes());
            //刷新
            fos.flush();
            System.out.println("写出成功！！！");
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
            //用完需要关闭管道
            if(fos != null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

    }
}
