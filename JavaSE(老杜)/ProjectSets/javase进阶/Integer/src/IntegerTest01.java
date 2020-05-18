public class IntegerTest01 {
    public static void main(String[] args) {
        Integer x = 100;
        System.out.println("x: " + x);
        doSome(x);
        System.out.println("x: " + x);
        String s = "hello";
        doS2(s);
        System.out.println(s);

        Integer y = new Integer("中文");
        System.out.println(y);


    }

    public static void doSome(Integer in){
        System.out.println("in: " + in);
        in = 180;//这里相当于重新对st赋了新的引用地址 new Integer(180).所以与传进来时的地址已经不同
        System.out.println("in: " + in);
    }


    public static void doS2(String st){
        System.out.println("st: " + st);
        st = "haha"; //这里相当于重新对st赋了新的引用地址
        System.out.println("st: " + st);
    }

}
