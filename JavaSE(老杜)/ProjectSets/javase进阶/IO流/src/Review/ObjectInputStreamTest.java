package Review;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/*
对象专属流，对象输入流，负责反序列化
 */
public class ObjectInputStreamTest {
    public static void main(String[] args) {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream( new FileInputStream("IO流\\stu"));
            Object obj = in.readObject();
            if(obj instanceof List)
            {
                List<Student> l = (List)obj;
                for (int i = 0; i < l.size(); i++)
                {
                    System.out.println(l.get(i));
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
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
