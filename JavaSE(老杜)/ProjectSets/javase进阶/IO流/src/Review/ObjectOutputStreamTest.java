package Review;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
对象字节输入流
序列化
 */
public class ObjectOutputStreamTest {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("IO流\\stu"));
            List<Student> l = new ArrayList<>();
            l.add(new Student("110","zhangsan"));
            l.add(new Student("120","lisi"));
            l.add(new Student("130","wangwu"));
            out.writeObject(l);
            out.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(out != null)
            {
                try {
                    out.flush();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
