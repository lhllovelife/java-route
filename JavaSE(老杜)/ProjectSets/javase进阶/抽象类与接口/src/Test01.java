public class Test01 {
    public static void main(String[] args) {
        MyMath mm = new A();
        System.out.println(mm.add(5,3));
    }
}

interface MyMath{
//    public static final double PI = 3.1415926535; /*常量*/
    double PI = 3.11415926; /*接口中的常量 public static final 默认可以省略*/
//    public abstract int add(int a, int b);/*抽象方法public abstract 默认可以省略*/
    int add(int a, int b);
    int sub(int a, int b);
}

class A implements MyMath{
    public int add(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b) {
        return a+b;
    }
}