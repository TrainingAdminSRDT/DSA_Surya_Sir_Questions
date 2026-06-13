class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        hasCycle solver = new hasCycle();

        // Create a list with a cycle: 3 -> 2 -> 0 -> -4 -> (points to node 2)
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        // create cycle: last node points to head.next
        head.next.next.next.next = head.next;

        System.out.println("Cyclic list detected: " + solver.hasCycle(head));

        // Create an acyclic list: 1 -> 2 -> null
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        System.out.println("Acyclic list detected: " + solver.hasCycle(head2));
    }
}