public class EqualsTest01 {
    public static void main(String[] args) {
        MyTime m1 = new MyTime(2000, 5, 1);
        MyTime m2 = new MyTime(2000, 4, 1);
        MyTime m3 = new MyTime(2000, 5, 1);
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m2.equals(m3));
    }
}

class MyTime{
    int year;
    int month;
    int day;

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean equals(Object obj){
//        访问子类型特有的需要，向下转型
//        if(obj instanceof  MyTime)
//        {
//            MyTime mt = (MyTime)obj;
//            if(this.year == mt.year && this.month == mt.month && this.day == mt.day)
//                return true;
//            else return false;
//        }
//        else return false;
//        优化
        if(obj == null || !(obj instanceof MyTime)) return false; //该对象为空 或者 该对象不是MyTime类型
        if(this == obj) return true; //如果传进来的对象和 当前对象是同一个，即引用内的地址相同
//        到这一步,传进来的对象 既不为空，也和当前对象不是同一个。并且还属于MyTime类型。向下转型判断即可
        MyTime mt = (MyTime)obj;
        return this.year == mt.year && this.month == mt.month && this.day == mt.day;

    }
}
