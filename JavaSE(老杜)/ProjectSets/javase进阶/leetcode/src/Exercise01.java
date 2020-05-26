import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        System.out.println(Solution.mySqrt(t));
    }
}

class Solution {
    public static  int mySqrt(int x) {
        int retVal = (int)Math.pow((x*1.0) , 0.5);
        return retVal;
    }
}