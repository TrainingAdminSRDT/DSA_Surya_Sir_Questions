public class Solution21 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(3);
        ListNode b = new ListNode(2);
        b.next = new ListNode(4);
        ListNode r = mergeTwoLists(a, b);
        while (r != null) { System.out.print(r.val + " "); r = r.next; }
    }
    static class ListNode {
        int val; ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) { l1.next = mergeTwoLists(l1.next, l2); return l1; }
        else { l2.next = mergeTwoLists(l1, l2.next); return l2; }
    }
}
