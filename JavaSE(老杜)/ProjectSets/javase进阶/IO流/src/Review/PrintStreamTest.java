package Review;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
打印流 PrintStream PrintWwiter
打印流不需要手动关闭
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        //构造方法传入一个参数：字节输出流对象
        try {
            PrintStream pro = new PrintStream(new FileOutputStream("IO流\\test07.txt"));
            System.out.println("zhangsan");
            System.out.println("lisi");
            //重定向打印方向。
            //System.setOut(PrintStream out)
            System.setOut(pro);
            System.out.println("lisi");
            System.out.println("jack");

            pro.println(180);

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
