package Review;

import java.io.*;

/*
BufferedBWriter 带有缓冲区的字符输出流对象
write()方法中可直接传入一个字符串对象
newLine()方法 可换行
 */
public class BufferedWriterTest {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        //构造方法中传入的参数是一个 Writer对象
        try
        {
            bw = new BufferedWriter(new OutputStreamWriter( new FileOutputStream("IO流\\temp05.txt")));
            bw.write("I like play basketball.");
            //换行
            bw.newLine();
            bw.write("I like play soccer ball.");
            bw.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null)
            {
                try
                {
                    bw.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
