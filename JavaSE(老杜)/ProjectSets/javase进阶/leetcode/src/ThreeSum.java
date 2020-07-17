import java.util.*;

/*
给定一个数组。找出 三个元素和为0的数据，记录每一组，组组之间不重复。

a + b + c = 0
1. 先将数组排序，由小到大。第一层循环遍历数组，先记录第一个元素，如果第一个元素>0，则不可能满足三者之和等于0；
2. 定义中间指针 和 尾指针。一个从左向右，一个从右向左。通过判断三者和与0的大小比较，判断指针的移动。
3. 为了保证结果唯一性，和为0的三个元素是唯一的。指针移动时候，所以需要跳过重复元素
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] arrs = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> l = threeSum(arrs);
//        List<Integer> l1 = l.get(0);
//        for (Integer i : l1)
//        {
//            System.out.println(i);
//        }
//        List<Integer> l2 = l.get(1);
//        System.out.println();

        System.out.println("列表数目" + l.size());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        //如果传入的数组长度为0，返回值为null
        List<List<Integer>> retValue = new ArrayList<>();
        if (nums.length == 0) return retValue;
        //对数组进行排序(从小到大)
        Arrays.sort(nums);
        //数组长度为len
        int len = nums.length;
        for(int p1 = 0; p1 < len; p1++)
        {
            System.out.println("循环");
            //如果第一个为正数，则运算结束
            if(nums[p1] > 0) return retValue;
            //保证结果唯一性，进行跳过重复的数字
            if(p1 > 0 && nums[p1]  == nums[p1-1]) continue;
            //定义中间指针
            int p2 = p1 + 1;
            //定义尾部指针
            int p3 = len - 1;
            while (p2 < p3)
            {
                int a = nums[p1];
                int b = nums[p2];
                int c = nums[p3];
                if(b + c == -a)
                {
                    System.out.println("a: " + a + " b：" + b + " c；" + c);
                    //将a b c存入
                    List<Integer> list = new ArrayList<>();
                    list.add(a);
                    list.add(b);
                    list.add(c);
                    retValue.add(list);
                    //去重
                    while (p2 < p3 && nums[p2] == nums[p2+1])
                    {
                        p2++;
                    }
                    while(p2 < p3 && nums[p3] == nums[p3-1])
                    {
                        p3--;
                    }
                    p2++;
                    p3--;
                }
                else if(b + c > -a)
                {
                    p3--;
                }
                else
                {
                    p2++;
                }
            }


        }
        return retValue;
    }
}
