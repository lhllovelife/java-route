import java.util.Arrays;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode a3 = new ListNode(4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);

        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(1, b2);
        /*
        遍历两个链表
        */
//        System.out.println(a1.val);
//        System.out.println(a1.next.val);
//        System.out.println(a1.next.next.val);
//        System.out.println(b1.val);
//        System.out.println(b1.next.val);
//        System.out.println(b1.next.next.val);

        ListNode l = mergeTwoLists(a1, b1);
        while (l != null)
        {
            System.out.println(l.val);
            l = l.next;
        }

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        int num = 0;
        int[] arr = new int[1005];
        while (l1 != null)
        {
//            System.out.println("加入的数据" + l1.val);
            arr[++num] = l1.val;
            l1 = l1.next;
        }
        while (l2 != null)
        {
            arr[++num] = l2.val;
            l2 = l2.next;
        }
        Arrays.sort(arr,1 , num+1);
        ListNode[] arrList = new ListNode[1005];
        for(int i = 1; i <= num; i++)
        {
//            System.out.println("第"  + i + "个数据：" + arr[i]);
            arrList[i] = new ListNode(arr[i]);
        }
        for (int i = 1; i <= num; i++)
        {
            if(i == num)
            {
                arrList[i].next = null;
                break;
            }
            arrList[i].next = arrList[i+1];
        }
        return arrList[1];
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
