package CourseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("E:\\B站学习\\java-route\\temp.txt");
            //每次读取一个字节的数据，然后输出
            int readData = 0;
            while( (readData = fis.read()) != -1)
            {
                char temp = (char) readData;
                System.out.println(temp);
            }
            
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            if(fis != null)
            {
                try
                {
                    fis.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
