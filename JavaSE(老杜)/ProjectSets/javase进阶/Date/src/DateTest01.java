import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTest01 {
    public static void main(String[] args) throws Exception {
        Date nowTime = new Date(); //午餐构造 初始值为当前时间
        System.out.println(nowTime);

        //日期对象 -> str
        SimpleDateFormat stf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String nowStr = stf.format(nowTime);
        System.out.println(nowStr);

        //Str->日期对象
        SimpleDateFormat  stf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss SSS");
        String t = "2020/05/17 12:00:05 789";
        Date d = stf2.parse(t);
        System.out.println(d);

        //获取当前时间 距 1970.1.1 00:00:00 的ms数
        long totalTime = System.currentTimeMillis();
        System.out.println(totalTime);

        //Date对象的有参构造方法 参数中是一个long类型的数据，单位是ms, 初始化值距离“基准时间”的时间对象
        Date d1 = new Date(1000);
        System.out.println(d1);

        Date d2 = new Date(System.currentTimeMillis() - (1000*60*60*24));
        System.out.println(d2);

    }
}
