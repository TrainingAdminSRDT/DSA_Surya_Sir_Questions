public class ReverseLinkedList {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode i=head;
        ListNode j=i.next;
        while(j.next!=null){
            ListNode temp=j.next;
            j.next=i;
            i=j;
            j=temp;
        }
        j.next=i;
        head.next=null;
        return j;
    }

}
