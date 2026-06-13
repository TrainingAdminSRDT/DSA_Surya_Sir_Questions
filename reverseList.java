class ListNode {
    int val;
    ListNode next;  
    ListNode() {}   
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}
public class reverseList {   
    public ListNode reverseListFunction(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;      
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        reverseList solver = new reverseList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        System.out.print("Original List: ");
        printList(head);
        ListNode reversedHead = solver.reverseListFunction(head);
        System.out.print("Reversed List: ");
        printList(reversedHead);
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
