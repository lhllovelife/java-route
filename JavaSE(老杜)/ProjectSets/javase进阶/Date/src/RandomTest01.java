import java.util.Random;

public class RandomTest01 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        Random r1 = new Random();
        arr[0] = r1.nextInt();
        arr[1] = r1.nextInt();
        arr[2] = r1.nextInt();
        arr[3] = r1.nextInt();
        arr[4] = r1.nextInt();
        for (int i = 0; i < 5; i++)
        {
            System.out.println( (i+1) + ": " + arr[i]);
        }

        int num6 = r1.nextInt(150);
        System.out.println("num6: " + num6);

//        Random r2 = new Random();
//        int num11 = r2.nextInt();
//        int num12 = r2.nextInt();
//        int num13 = r2.nextInt();
//        System.out.println("num11: " + num11);
//        System.out.println("num12: " + num12);
//        System.out.println("num13: " + num13);
    }
}
