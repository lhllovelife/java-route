import java.util.Date;
import java.text.SimpleDateFormat;

public class ExceptionTest01 {
    public static void main(String[] args) throws java.text.ParseException {
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
    }
}
