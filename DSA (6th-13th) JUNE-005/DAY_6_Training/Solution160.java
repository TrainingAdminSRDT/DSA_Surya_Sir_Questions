public class Solution160 {
    public static void main(String[] args) {
        ListNode c = new ListNode(8);
        ListNode a = new ListNode(4);
        a.next = new ListNode(1);
        a.next.next = c;
        ListNode b = new ListNode(5);
        b.next = new ListNode(0);
        b.next.next = new ListNode(1);
        b.next.next.next = c;
        System.out.println(getIntersectionNode(a, b).val);
    }
    static class ListNode {
        int val; ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode getIntersectionNode(ListNode a, ListNode b) {
        ListNode p = a, q = b;
        while (p != q) {
            p = (p == null) ? b : p.next;
            q = (q == null) ? a : q.next;
        }
        return p;
    }
}
