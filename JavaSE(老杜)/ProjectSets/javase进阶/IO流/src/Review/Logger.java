package Review;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
日志生成类
 */
public class Logger {
    public static void log(String s) {
        try {
            PrintStream in = new PrintStream( new FileOutputStream("IO流\\log.txt",true));
            System.setOut(in);
            //获取当前时间
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String time = sdf.format(date);
            System.out.println(time + ": " + s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
