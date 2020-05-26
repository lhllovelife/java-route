import java.util.Arrays;
import java.util.Random;

public class RandomTest02 {
    public static void main(String[] args) {
        Random r = new Random();
        int arr[] = new int[5];
        int cnt = 1;
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = -1;
        }
        while (cnt <= 5)
        {
            int num = r.nextInt(6); //随机生成的数为 [0,6);
            System.out.println("随机产生的数据：" + num);
            if(!contain(arr, num))
            {
                System.out.println("----------放进去的数：" + num);
                arr[0] = num;
                cnt++;
                System.out.println("======放进去" + (cnt-1) + "个数字=====");
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static boolean contain(int[] arr, int key){
        Arrays.sort(arr);
        if(Arrays.binarySearch(arr, key) >= 0)
        {
            System.out.println(key + "已经在数组中");
            return true;
        }
        else return false;
//        return Arrays.binarySearch(arr, key) >= 0;
    }
}
