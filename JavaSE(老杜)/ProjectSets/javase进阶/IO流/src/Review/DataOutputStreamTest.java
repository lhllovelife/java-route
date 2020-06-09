package Review;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
数据流专属
DataOutputStream 数据字节输出流
 */
public class DataOutputStreamTest {
    public static void main(String[] args) {
        DataOutputStream out = null;
        try {
            //构造方法中传入一个参数：字节输出流对象
            out = new DataOutputStream(new FileOutputStream("IO流\\test07.txt"));
            out.writeByte(10);
            out.writeShort(100);
            out.writeInt(150);
            out.writeLong(180000);
            out.writeFloat(8.889f);
            out.writeDouble(3.14159226);
            out.writeBoolean(true);
            out.writeChar('A');
            out.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(out != null)
            {
                try {
                    out.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
