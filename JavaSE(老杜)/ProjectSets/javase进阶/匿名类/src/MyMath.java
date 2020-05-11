public class MyMath {
//    这里不要把接口特殊化，它也是一种引用数据类型。
    public void mySum(Compute c, int a, int b){
        int value = c.sum(a,b);
        System.out.println(a + "+" + b + "=" + value);
    }
}
