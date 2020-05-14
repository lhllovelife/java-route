import java.util.Arrays;

public class ArrayTest05 {
    public static void main(String[] args) {
        int[] a = {5, 4, 600, 520, 18, 3, 2, 1};
//        Arrays.sort(a);
//        BubbleSort(a);
        SelectSort(a);
        for(int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
        int index = Binary(a, 540);
        System.out.println(index != -1 ?"该元素的标是：" + index : "该元素不存在");
    }
//    冒泡算法
    public static void BubbleSort(int[] a){
        boolean flag = true;
        for(int i = 0; flag; i++)
        {
            flag = false;
            for(int j = a.length - 1; j > i; j--) //每循环一次，左边的已排序部分增加一个.从右向左，两两交换，选出未排序部分中最小的。
            {
                if(a[j] < a[j-1])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    flag = true; //证明该次循环有交换数据。
                }
            }
        }
    }

//    简单选择算法
    public static void SelectSort(int[] a){
        for(int i = 0; i < a.length - 1; i++)
        {
            int minPos = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[j] < a[minPos]) minPos = j;
            }
            if(i != minPos)
            {
                int temp = a[i];
                a[i] = a[minPos];
                a[minPos] = temp;
            }
        }
    }

//    二分查找
    public static int Binary(int[] a, int desc){
        int l = 0, r = a.length - 1;
        int mid;
        while(l <= r)
        {
            mid = (l + r) >> 1;
            if(a[mid] < desc)
            {
                l = mid + 1;
            }
            else if(a[mid] > desc)
            {
                r = mid - 1;
            }
            else if(a[mid] == desc) return mid;
        }
        return -1;

    }







    /**
     *
     * @param a
     */
/*    public static void BubbleSort(int[] a){
        boolean flag = true;
        for(int i = 0; flag; i++)
        {
            flag = false;
            for (int j = a.length - 1; j > i; j--)
            {
                //如果小于前一个数，进行交换
                if(a[j] < a[j-1])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                    flag = true;
                }
            }
        }
    }*/
}
/*
1, 2, 18, 7, 0, 5, 7, 9
0
1
2
5
7
7
9
18
 */