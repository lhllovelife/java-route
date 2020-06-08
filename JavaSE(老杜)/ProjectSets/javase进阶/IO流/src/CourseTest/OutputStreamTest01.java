package CourseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try
        {
            //true 代表追加，在原文件末尾写入，不会清空原文件内容
            fos = new FileOutputStream("IO流\\tempOutput01.txt",true);
            String s = new String("今天是2020年6月7号, 上午10:35分。\n距离语文考试结束还有一个半小时\n");
            //将字符串转换成byte[]
            byte[] bytes = s.getBytes();
            fos.write(bytes);
            //刷新输出流，使缓存数据被写出来
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
            //用完后，关闭输出流
            if(fos != null)
            {
                try
                {
                    fos.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
