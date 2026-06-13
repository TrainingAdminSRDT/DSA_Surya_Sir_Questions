/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
            return false;

        ListNode t1=head;
        ListNode t2=head.next;

        if(t2==null)
            return false;
            
        while(t1!=t2){
            if(t2.next==null)
                return false;
            if(t2.next.next==null)
                return false;
            t2=t2.next.next;

            t1=t1.next;
        }

        return t2!=null?true:false;

    }
}