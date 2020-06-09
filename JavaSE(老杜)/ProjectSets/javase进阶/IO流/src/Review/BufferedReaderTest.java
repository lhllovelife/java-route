package Review;

import java.io.*;

// 带有缓冲区的字符输入流对象
//使用时候不需要 创建char[] 和 byte[]
//可以读取一行，返回一个String.（不包含行位的换行符）
public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader br = null;
        //构造方法中的参数是一个Reader对象
        try {
            br = new BufferedReader( new InputStreamReader( new FileInputStream("IO流\\temp01.txt")));
            //读取一行文本(不含换行符号),返回一个字符串对象
            String s = null;
            while ( (s = br.readLine()) != null)
            {
                System.out.println(s);
            }
            System.out.println("文件读取完毕！");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null)
            {
                try {
                    br.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
