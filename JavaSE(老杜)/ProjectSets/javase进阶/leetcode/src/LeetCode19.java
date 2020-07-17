import java.io.Flushable;

public class LeetCode19 {
    public static void main(String[] args) {
        ListNode a5 = new ListNode(5);
        ListNode a4 = new ListNode(4, a5);
        ListNode a3 = new ListNode(3, a4);
        ListNode a2 = new ListNode(2, a3);
        ListNode a1 = new ListNode(1, a2);
        ListNode ret = removeNthFromEnd(a1,5);
        System.out.println(ret.val);
        System.out.println(ret.next.val);
        System.out.println(ret.next.next.val);
        System.out.println(ret.next.next.next.val);
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return null;
        ListNode head1 = head;
        //计算链表长度
        int cnt  = 1;
        while (head1.next != null){
            cnt++;
            head1 = head1.next;
        }
        //只有当删除的结点是第一个的时候，头结点才会改变
        if(cnt == n){
            return head.next;
        }
        int target = cnt - n;
        int num = 1;
        ListNode head2 = head;
        while (num < target){
            num++;
            head2 = head2.next;
        }
//        System.out.println(head2.val);
        head2.next = head2.next.next;
        return head;
    }
}
/*

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

 */
