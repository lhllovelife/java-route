package CourseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("IO流\\tempFile01.txt");
            //返回剩余可读的字节数
            int num = fis.available();
            byte[] bytes = new byte[num];
            //跳过两个字节
            fis.skip(2);
            //一次性读出
            int readCount = fis.read(bytes);
            //读多少，输出多少
            System.out.println(new String(bytes, 0, readCount));
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
            if (fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
