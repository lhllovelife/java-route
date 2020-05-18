import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class IntegerTetst02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while ()
//        {
            int[] arr = {1,3,5,6};
            System.out.println(Solution.searchInsert(arr,0));
            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
//        }
    }

}

class Solution {
//    7
    public static int reverse(int x) {
        String s = String.valueOf(x);
        StringBuffer ans = new StringBuffer(40);
        char ch = s.charAt(0);
        int l = 0;
        if(ch == '-')
        {
            l = 1;
            ans.append("-");
        }
        for(int i = s.length() - 1; i >= l; i--)
        {
            ans.append(s.charAt(i));
        }
        long retval = Long.parseLong(ans.toString());
        if(retval <= Integer.MAX_VALUE && retval >= Integer.MIN_VALUE) return (int)retval;
        else return 0;
    }
//    9
        public boolean isPalindrome(int x) {
            String s1 = String.valueOf(x);
            StringBuffer sb = new StringBuffer(40);
            for(int i = s1.length() - 1; i >= 0; i--)
            {
                sb.append(s1.charAt(i));
            }
            String s2 = sb.toString();
            if(s1.equals(s2)) return true;
            else return false;
        }

//        13 罗马数字
        public static int romanToint(String s){
            int[] arr = new int[1005];
            char ch;
            for(int i = 0; i < s.length(); i++)
            {
                ch = s.charAt(i);
                if(ch == 'I') arr[i] = 1;
                else if(ch == 'V') arr[i] = 5;
                else if(ch == 'X') arr[i] = 10;
                else if(ch == 'L') arr[i] = 50;
                else if(ch == 'C') arr[i] = 100;
                else if(ch == 'D') arr[i] = 500;
                else if(ch == 'M') arr[i] = 1000;
            }
//            for (int i = 0; i < s.length(); i++)
//            {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
            int ans = 0;
            int i = s.length() - 1;
            while ( i >= 0)
            {
                if(i == 0)
                {
                    ans += arr[i];
                    break;
                }
                if(arr[i] <= arr[i-1])
                {
                    ans += arr[i];
                    i--;
                }
                else
                {
                    ans += (arr[i] - arr[i-1]);
                    i -= 2;
                }
            }
            return ans;
        }

        public static boolean isValid(String s) {
            Stack<Character> st1 = new Stack<>();
            Stack<Character> st2 = new Stack<>();
            for (int i = 0; i < s.length(); i++)
            {
                st1.push(s.charAt(i));
            }
            while(!st1.empty())
            {
                if(st2.empty()) st2.push(st1.pop()); //如果第二个栈为空，则先弹出st1的顶部数据给st2
                if(st1.empty()) break; //弹给st2数据后，st1为空，说明只剩一个字符了，直接退出循环
                char c1 = st1.peek(); //各拿出栈顶数据比较
                char c2 = st2.peek();
//                System.out.println("C1 = " + c1 + "  C2 = " + c2);
                if( (c1=='(' && c2 ==')') || (c1=='[' && c2==']') || (c1=='{' && c2=='}'))
                {
                    //如果匹配，则将已经匹配的两个字符弹出
                    st1.pop();
                    st2.pop();

                }
                else st2.push(st1.pop()); //如果不匹配，则将st1栈中的数据给st2栈
            }
            return st2.empty();
        }

        //26
        public static int removeDuplicates(int[] nums) {
            if(nums.length == 0) return 0; //数组长度为0，直接返回0
            int len = 1;
            int pos = 0, val = nums[0];
            for(int i = 1; i < nums.length; i++)
            {
                if(nums[i] != val)
                {
                    len++;
                    val  = nums[i];
                    nums[++pos] = nums[i];
                }
            }
            return len;
        }
        //27
        public static int removeElement(int[] nums, int val) {
            if(nums.length == 0) return 0;
            Arrays.sort(nums);
            int l = 0, r = 0, cnt = 0;
            boolean tagl = true, tagr = true;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] == val)
                {
                    if(tagl)
                    {
                        l = i;
                        tagl = false;
                    }
                    cnt++;
                }
                if(!tagl && nums[i] != val)
                {
                    if(tagr)
                    {
                        r = i;
                        tagr = false;
                    }
                }
            }
            if(nums[nums.length - 1] == nums[l]) return nums.length - cnt;
//            System.out.println("l:" + l + " r: " + r);
            int t = nums.length - r;
//            System.out.println("数组长度: " + nums.length);
//            System.out.println("循环次数 " + (nums.length - r));
            for(int i = 1; i <= t; i++)
            {
//                System.out.println("第" + i + "次循环 " + "左:" + l + " 右: " + r);
                nums[l] = nums[r];
                l++;
                r++;
//                System.out.println("Ok");
            }
//            System.out.println("cnt: " + cnt);
            return nums.length - cnt;
        }
        //35
        public static int searchInsert(int[] nums, int target) {
            if(nums[nums.length - 1] < target) return nums.length;
            int ans = 0, pos = 0;
            for(int i = 0; i < nums.length; i++)
            {
                if(nums[i] >= target)
                {
                    ans = i;
                    break;
                }
            }
            return ans;
        }
}
/*
0 1 2 2 3 0 4 2

0 0 1 2 2 2 3 4
      3   5 6
 */