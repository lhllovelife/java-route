package Review;

import java.io.*;

/*
利用带有缓冲区的字符输入流和字符输出流对象进行拷贝
 */
public class CopyTest03 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try
        {
            br = new BufferedReader( new InputStreamReader( new FileInputStream("IO流\\temp01.txt")));
            bw = new BufferedWriter( new OutputStreamWriter( new FileOutputStream("IO流\\temp06.txt")));
            String data = null;
            while ((data = br.readLine()) != null)
            {
                bw.write(data);
                bw.newLine();
            }
            bw.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null)
            {
                try {
                    br.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bw != null)
            {
                try {
                    bw.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
