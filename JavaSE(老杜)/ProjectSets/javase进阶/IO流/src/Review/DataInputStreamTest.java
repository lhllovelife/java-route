package Review;

import java.io.*;

/*
数据字节输入流
DataOutputStream写的文件，只能使用DataInputStream去读
 */
public class DataInputStreamTest {
    public static void main(String[] args) {
        DataInputStream in = null;
        try {
            //构造方法
            in = new DataInputStream( new FileInputStream("IO流\\test07.txt"));
            /*
            out.writeByte(10);
            out.writeShort(100);
            out.writeInt(150);
            out.writeLong(180000);
            out.writeFloat(8.889f);
            out.writeDouble(3.14159226);
            out.writeBoolean(true);
            out.writeChar('A');
             */
            System.out.println(in.readByte());
            System.out.println(in.readShort());
            System.out.println(in.readInt());
            System.out.println(in.readLong());
            System.out.println(in.readFloat());
            System.out.println(in.readDouble());
            System.out.println(in.readBoolean());
            System.out.println(in.readChar());

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in != null)
            {
                try {
                    in.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
