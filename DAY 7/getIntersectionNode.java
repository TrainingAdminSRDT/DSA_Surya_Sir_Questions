class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class getIntersectionNode {
    public ListNode findIntersection(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;       
        ListNode a = headA;
        ListNode b = headB;       
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }
    public static void main(String[] args) {
        getIntersectionNode solver = new getIntersectionNode();   
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);   
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;  
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;       
        ListNode intersection = solver.findIntersection(headA, headB);       
        if (intersection != null) {
            System.out.println("Intersected at '" + intersection.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}