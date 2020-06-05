import java.util.ArrayList;
import java.util.Collection;

public class ArrayListTest01 {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        int[] a = {58,22,17,25,51,37,28,12,15,392,9,18,8,6,12,14};
        int sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        System.out.println(sum * 0.1);
    }
}
