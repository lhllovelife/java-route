import java.util.Arrays;

/*
合并k个排序列表
纯暴力了，将所有的结点的值取出，用数组进行排序。
***链表数组中： 注意可能存在取出的头结点为空的情况。
 */
public class Leetcode23 {
    public static void main(String[] args) {

        ListNode a3 = new ListNode(5);
        ListNode a2 = new ListNode(4, a3);
        ListNode a1 = new ListNode(1, a2);

        ListNode b3 = new ListNode(4);
        ListNode b2 = new ListNode(3, b3);
        ListNode b1 = new ListNode(1, b2);

        ListNode c2 = new ListNode(6);
        ListNode c1 = new ListNode(2, c2);
        ListNode[] lists = {a1, b1, c1};
        ListNode r = mergeKLists(lists);
        while (r != null){
            System.out.println(r.val);
            r = r.next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists == null) return null;
        //将链表中数据取出放到数组中
        int[] arrs = new int[1000005];
        int cnt = 0;
        int listLength = lists.length;
        for (int i = 0; i < listLength; i++){
            ListNode head = lists[i];
            if(head == null) continue;
            arrs[++cnt] = head.val;
            while (head.next != null){
                head = head.next;
                arrs[++cnt] = head.val;
            }
        }
        Arrays.sort(arrs, 1, cnt+1);
        ListNode[] res = new ListNode[cnt+5];
        for (int i = 1; i <= cnt; i++){
            res[i] = new ListNode(arrs[i]);
        }
        for (int i = cnt - 1; i >= 1; i--){
            res[i].next = res[i+1];
        }
        return res[1];
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
/*
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */