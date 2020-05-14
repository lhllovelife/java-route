import java.util.Scanner;

public class ArrayTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = {15, 20, 0, 48};
        int x;
        for(int i = 0; i < 5; i++)
        {
            x = sc.nextInt();
            a[i] = x;
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        String[] s = new String[0];
//        System.out.println(s[0]);

        int[] arr1 = {15, 6, 7};
        int[] desc = new int[7];
        System.arraycopy(arr1 , 0, desc, 3, 3);
        for (int i = 0; i < desc.length; i++)
            System.out.print(desc[i] + " ");


    }
}
