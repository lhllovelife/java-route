import java.util.Scanner;
import java.util.Arrays;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        int x;
        for(int i = 0; i < a.length; i++)
        {
            x = sc.nextInt();
            a[i] = x;
        }
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int index = Arrays.binarySearch(a, 10);
        System.out.println("下标：" + index);
    }
}
// 5 4 5 67 5102 56