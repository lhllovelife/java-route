//4、编写Java程序模拟简单的计算器。
//        定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
//        编写构造方法赋予n1和n2初始值
//        再为该类定义加addition()、减subtration()、乘multiplication()、除division()等公有实例方法
//        分别对两个成员变量执行加、减、乘、除的运算。

public class Homework03 {
    public static void main(String[] args) {
        Number n1 = new Number(18, 0);
        System.out.println(n1.add());
        System.out.println(n1.sub());
        System.out.println(n1.mul());
        System.out.println(n1.div());
    }
}

class Number{
    private int n1;
    private int n2;

    public Number(){

    }
    public Number(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int add(){
        return this.getN1() + this.getN2();
    }

    public int sub(){
        return this.getN1() - this.getN2();
    }

    public int mul(){
        return this.getN1() * this.getN2();
    }

    public int div(){
        return this.getN1() / this.getN2();
    }
}