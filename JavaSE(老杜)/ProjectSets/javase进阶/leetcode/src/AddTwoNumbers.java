import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
    传进的两个参数均为非空链表。每个链表代表一个非负整数，将两个非负整数相加，返回一个链表。

    模拟加法
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode a3 = new ListNode(5);
        ListNode a2 = new ListNode(4,a3);
        ListNode a1 = new ListNode(2,a2);

        ListNode b3 = new ListNode(5);
        ListNode b2 = new ListNode(6,b3);
        ListNode b1 = new ListNode(8,b2);
        ListNode b0 = new ListNode(1,b1);

        ListNode retVal = addTwoNumbers(a3 ,b3);
//        for(int i = 0; i <= 10; i++)
//        {
//            System.out.println(i + ": " + ret[i]);
//        }
        System.out.println(retVal.val);
        System.out.println(retVal.next.val);
//        System.out.println(retVal.next.next.val);
//        System.out.println(retVal.next.next.next.val);
//        System.out.println(retVal.next.next.next.next.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] arr1 = new int[1005];
        int[] arr2 = new int[1005];
        int[] sum = new int[1005];
        int cnt1 = 0, cnt2 = 0;
        while (l1 != null)
        {
            arr1[cnt1++] = l1.val;
            l1 = l1.next;
        }

        while (l2 != null)
        {
            arr2[cnt2++] = l2.val;
            l2 = l2.next;
        }
        //将两个数组值模拟相加
        int max_len = Math.max(cnt1, cnt2);
        for(int i = 0; i <max_len; i++)
        {
            int t = sum[i] + arr1[i] + arr2[i];
            if(t < 10) sum[i] = t;
            else
            {
                sum[i] = t - 10;
                sum[i+1]++; //进1
            }
        }
//        System.out.println("循环 sum[0] ：" + sum[0]);
//        System.out.println("循环 sum[1] ：" + sum[1]);
//        System.out.println(max_len);
        //最终链表长度
        int len = sum[max_len] != 0 ? max_len + 1 : max_len;
//        System.out.println("链表长度：" + len);
        /*
        2 -> 4 -> 3
        1 -> 8 -> 6 -> 4
        3 -> 2 -> 0 -> 5
        len = 4
         */
        //将sum数组中的元素装换成一个个的结点对象
        List<ListNode> l = new ArrayList<>();
        for(int  i = 0; i < len; i++)
        {
            l.add(new ListNode(sum[i]));
        }
        //将结点对象连接成一个链表
        for(int i = len - 2; i >= 0; i--)
        {
            l.get(i).next = l.get(i+1);
        }
        return l.get(0);
    }
}

/*
自定义的结点类
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

 */
