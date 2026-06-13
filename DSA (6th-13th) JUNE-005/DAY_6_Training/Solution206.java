public class Solution206 {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        ListNode r = reverseList(h);
        while (r != null) { System.out.print(r.val + " "); r = r.next; }
    }
    static class ListNode {
        int val; ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode p = null, c = head;
        while (c != null) { ListNode n = c.next; c.next = p; p = c; c = n; }
        return p;
    }
}
