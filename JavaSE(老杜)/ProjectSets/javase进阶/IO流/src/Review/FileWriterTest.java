package Review;

import java.io.FileWriter;
import java.io.IOException;

/*
练习FileWriter(文件字符输出流)的方法
write()方法 的参数可以使一个字符串对象
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("IO流\\temp04.txt");
            //1.每次写出一个char[]数组
            char[] chars = new char[20];
            String s0 = "I am a student!";
            s0.getChars(0, s0.length(), chars, 0);
            fw.write(chars, 0, s0.length());

            //2每次输出一个 字符串对象
            fw.write("ABCDEFG");
            fw.flush();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(fw != null)
            {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
