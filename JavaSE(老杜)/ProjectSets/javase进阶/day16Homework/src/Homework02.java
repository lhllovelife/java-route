//3、在程序中经常要对时间进行操作但是并没有时间类型的数据。
//        那么我们可以自己实现一个时间类来满足程序中的需要。
//        定义名为MyTime的类其中应有三个整型成员时hour分minute秒second
//        为了保证数据的安全性这三个成员变量应声明为私有。
//        为MyTime类定义构造方法以方便创建对象时初始化成员变量。
//        再定义diaplay方法用于将时间信息打印出来。
//        为MyTime类添加以下方法
//        addSecond(int sec)
//        addMinute(int min)
//        addHour(int hou)
//        subSecond(int sec)
//        subMinute(int min)
//        subHour(int hou)
//        分别对时、分、秒进行加减运算。

public class Homework02 {
    public static void main(String[] args) {
        Mytime t1 = new Mytime(10, 58,52);
        t1.detail();

        System.out.println("增加15个小时");
        t1.addHour(15);
        t1.detail();

        System.out.println("增加200秒");
        t1.addSecond(200);
        t1.detail();

        System.out.println("增加10分钟");
        t1.addMinute(10);
        t1.detail();

        System.out.println("增加8秒");
        t1.addSecond(8);
        t1.detail();

        System.out.println("减少5分钟");
        t1.subMin(5);
        t1.detail();

        System.out.println("减少两个小时");
        t1.subHour(2);
        t1.detail();

        System.out.println("减少40秒");
        t1.subSec(40);
        t1.detail();
    }
}
//时间类
class Mytime{
//    属性私有化
    private int hour;
    private int minute;
    private int second;

//    无参构造方法
    public Mytime(){

    }
//    有参构造方法
    public Mytime(int hour, int minute, int second){
        if( (hour<=24 && hour>=0) && (minute<=60 && minute>=0) && (second<=60 && second>=0) ){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else System.out.println("您输入的时间格式不正确！");
    }
//    setter and getter方法

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<=24 && hour>=0){
            this.hour = hour;
        }
        else System.out.println("您输入的时间格式不正确！");
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute<=60 && minute>=0){
            this.minute = minute;
        }
        else System.out.println("您输入的时间格式不正确！");
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second<=60 && second>=0){
            this.second = second;
        }
        else System.out.println("您输入的时间格式不正确！");
    }

//    加时间

    public void addHour(int hou){
        int oldHour = this.getHour(); /*局部变量保存当前对象的时间*/
        oldHour = (oldHour + hou) % 24; /*增加后的小时对24取余*/
        this.setHour(oldHour); /*将计算好的时间通过setter赋值给对象中的小时属性*/
    }
    public void addMinute(int min){
        int oldMin = this.getMinute(); /*局部变量保存当前对象的 分钟*/
        int nowMin = (oldMin + min) % 60;
        this.setMinute(nowMin); /*计算后的分钟赋值给当前对象*/
        this.addHour((oldMin+min)/60); /*每满60分钟，增加一个小时*/
    }
    public void addSecond(int sec){
        int oldSec = this.getSecond(); /*获取当前对象的 秒*/
        int nowSec = (oldSec + sec) % 60;
        this.setSecond(nowSec); /*计算后的秒赋值给对象*/
        this.addMinute((oldSec+sec)/60);
    }

//减时间
    public void subHour(int hour){
        this.addHour(-hour);
    }
    public void subMin(int min){
        this.addMinute(-min);
    }
    public void subSec(int sec){
        this.addSecond(-sec);
    }

    public void detail(){
        System.out.println("目前时间： " + this.getHour() + ":" + this.getMinute() + ":" + this.getSecond() );
    }
}
