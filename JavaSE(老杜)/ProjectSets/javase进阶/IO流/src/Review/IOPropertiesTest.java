package Review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
IO + Properties
 */
public class IOPropertiesTest {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = new FileInputStream("IO流\\ceshi.properties");
            //创建一个Properties集合
            Properties pro = new Properties();
            //参数为一个输入流对象
            pro.load(in);
            //通过兼职获取属性值
            System.out.println(pro.getProperty("usename"));
            System.out.println(pro.getProperty("password"));
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
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
