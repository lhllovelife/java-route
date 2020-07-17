import java.util.ArrayList;
import java.util.List;

/*
Leetcode 24 Swap Nodes in Pairs
    交换相邻的两个结点
    //特殊情况 传入的是空链表
 */

public class SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode b4 = new ListNode(4);
        ListNode b3 = new ListNode(3,b4);
        ListNode b2 = new ListNode(2,b3);
        ListNode b1 = new ListNode(1,b2);
        ListNode b0 = new ListNode(5,b1);
        ListNode head = swapPairs(b0);
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
        System.out.println(head.next.next.next.next.val);

    }
    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        //将该链表的每个结点存储在列表中
        List<ListNode> l = new ArrayList<>();
        while (head != null)
        {
            l.add(head);
            head = head.next;
        }
        //进行相邻结点交换
        int num = l.size();
        ListNode temp;
        if(num % 2 != 0) num -= 1;
        for(int i = 0; i < num; i+=2)
        {
            temp = l.get(i);
            l.set(i, l.get(i+1));
            l.set(i+1, temp);
        }

        //构造新的链表
        num = l.size();
        for(int i = num - 1; i >= 0; i--)
        {
            if(i == num -1)
            {
                temp = l.get(i);
                temp.next = null;
            }
            else
            {
                l.get(i).next = l.get(i+1);
            }
        }
        return l.get(0);
    }
}
