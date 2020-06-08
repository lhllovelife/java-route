package CourseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.IntBuffer;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream("E:\\B站学习\\java-route\\temp.txt");
            //准备一个byte[]数组
            byte[] bytes = new byte[4];
            int readCount = 0;
            while ( (readCount = fis.read(bytes)) != -1)
            {
                //读到多少个字节到bytes数组中，转多少个出来为String
                System.out.print(new String(bytes, 0, readCount));
            }
//            System.out.println();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally
        {
            //finally语句块中的代码一定会执行(即使try中出现异常)
            //如果fis为null,说明没创建成文件输入流对象，不用关闭。避免空指针异常
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
/*
ABCDEFG123
ABCD
EFG1
23G1

" ABC "
"13245"
ABCDEF


 */
