//Java中的二维数组
import  java.util.Scanner;

public class ArrayTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.next();
        System.out.println("数字：" + a);
        System.out.println("字符串：" + s);
//        int[][] a = {{1, 2, 3}, {4, 5, 6}};
//        String s = "12";
//        char r = s.charAt(0);
//        char c = s.charAt(1);
//        r -= '0';
//        c -= '0';
//        System.out.println(a[r][c]);
//        int[][] a1 = new int[5][5];
//        int x;
//        for (int i = 1; i <= 4; i++)
//        {
//            for (int j = 1; j <= 4; j++)
//            {
//                x = sc.nextInt();
//                a1[i][j] = x;
//            }
//        }
//        for (int i = 0; i <= 4; i++)
//        {
//            for (int j = 0; j <= 4; j++)
//            {
//                System.out.print(a1[i][j] + " ");
//            }
//            System.out.println();
//        }

    }
}

/*
1 3 5 7
2 4 6 8
0 1 2 5
5 6 99 7

0 0 0 0 0
0 1 3 5 7
0 2 4 6 8
0 0 1 2 5
0 5 6 99 7
 */
