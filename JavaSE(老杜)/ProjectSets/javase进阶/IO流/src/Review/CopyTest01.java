package Review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
利用 FileInputStream和FileOutputstream进行 文件的拷贝

 */
public class CopyTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try
        {
            fis = new FileInputStream("IO流\\copySrc.html");
            fos = new FileOutputStream(("IO流\\copyDesc.html"));
            //准备一个byte数组，读取多少写出多少
            byte[] bytes = new byte[1024 * 1024];
            int readCount = 0;
            while ( (readCount = fis.read(bytes)) != -1)
            {
                //读到多少字节，写出多少字节
                fos.write(bytes, 0, readCount);
            }
            //刷新
            fos.flush();
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
            if(fis != null)
            {
                try {
                    fis.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null)
            {
                try {
                    fos.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
