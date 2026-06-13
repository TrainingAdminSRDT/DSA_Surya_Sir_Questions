public class Solution141 {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = h;
        System.out.println(hasCycle(h));
    }
    static class ListNode {
        int val; ListNode next;
        ListNode(int x) { val = x; }
    }
    public static boolean hasCycle(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
            if (s == f) return true;
        }
        return false;
    }
}
