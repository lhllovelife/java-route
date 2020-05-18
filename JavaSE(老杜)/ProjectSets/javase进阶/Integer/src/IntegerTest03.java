import javax.print.DocFlavor;

public class IntegerTest03 {
    public static void main(String[] args) {
        Integer a = new Integer(125);
        Integer b = new Integer(125);
        Integer c = 127;
        Integer d = 127;
        System.out.println(a == b);
        System.out.println(c == d);

        //手动装箱 手动拆箱
        Integer x = new Integer(150);
        System.out.println("x == " + x);
        int y = x.intValue();
        System.out.println("y == " + y);

        int[] arr = {};
        System.out.println(arr.length);

        String s1 = "120";
        String s2 = "-158";
        String s3 = "3";
        String s4 = "1.00";
        int val1 = Integer.parseInt(s1);
        System.out.println(val1);

        double val2 = Double.parseDouble(s1);
        System.out.println(val2 + 1.5);

        long val3 = Long.parseLong(s3);
        System.out.println(val3);

        float val4 = Float.parseFloat(s4);
        System.out.println(val4);
    }
//    public static void test(int x){
//        System.out.println("do");
//    }
}
