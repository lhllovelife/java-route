package Review;

import java.io.*;

public class CopyTest02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("IO流\\copySrc.html");
            fw = new FileWriter("IO流\\copyDesc.html");
            char[] chars = new char[512 *1024];
            int readCount = 0;
            while ( (readCount = fr.read(chars)) != -1)
            {
                //读多少，写多少
                fw.write(chars, 0, readCount);
            }

            fw.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            if(fr != null)
            {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fw != null)
            {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
