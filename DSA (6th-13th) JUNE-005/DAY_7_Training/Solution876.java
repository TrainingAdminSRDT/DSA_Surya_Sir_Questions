public class Solution876 {
    public static void main(String[] args) {
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        System.out.println(middleNode(h).val);
    }
    static class ListNode {
        int val; ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode middleNode(ListNode head) {
        ListNode s = head, f = head;
        while (f != null && f.next != null) { s = s.next; f = f.next.next; }
        return s;
    }
}
