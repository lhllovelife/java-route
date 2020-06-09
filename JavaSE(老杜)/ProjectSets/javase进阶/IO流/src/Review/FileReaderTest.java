package Review;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
1. 练习FlieReader(文件字符输入流)的一些操作

 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try
        {
            fr = new FileReader("IO流\\temp03.txt");
/*          1. 每次读取一个数据
            int readData = 0;
            while ( (readData = fr.read()) != -1)
            {
                System.out.print( (char)readData);
            }
 */

//          2.准备一个char[] 数组。
            char[] chars = new char[10];
            int readCount = 0;
            while ( (readCount = fr.read(chars)) != -1)
            {
                //读多少输出多少
                //将字符数组通过构造方法new出一个字符串
                System.out.print(new String(chars, 0, readCount));
            }

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
            if(fr != null)
            {
                try {
                    fr.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
