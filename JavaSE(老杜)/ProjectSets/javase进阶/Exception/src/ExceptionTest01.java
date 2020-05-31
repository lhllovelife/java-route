import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class ExceptionTest01 {
    public static void main(String[] args) throws ParseException {
        Integer x = 100;
        int y = x.intValue();
        Integer z = Integer.valueOf(y);
        System.out.println(y);

        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s1 = sdf.format(d);
        System.out.println(s1);

        String s2 = "1999/04/07 18:00:08 123";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS");
        Date d2 = sdf2.parse(s2);
        System.out.println("d2: " + d2);

        System.currentTimeMillis();
        Date d3 = new Date(1*1000*60*60*24);
        String s3 = sdf.format(d3);
        System.out.println("d3: " + s3);

        Date d4 = new Date(1);
        String s4 = sdf.format(d4);
        System.out.println("d4: " + s4);

        Random r = new Random();
        int temp = r.nextInt(15);
        System.out.println(temp);
    }
}
