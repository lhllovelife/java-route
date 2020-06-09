package Review;

public class Test {
    public static void main(String[] args) {
        char[] chars = {'a','b','c','c'};
        String s0 = new String(chars);
        System.out.println("s0: " + s0);
        String s2 = String.valueOf(chars, 0, 2);
        System.out.println("s2: " + s2);
    }
}
