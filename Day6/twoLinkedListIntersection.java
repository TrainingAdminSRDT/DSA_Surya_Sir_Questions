public class twoLinkedListIntersection {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     ListNode i=headA;
     ListNode j=headB;
     while(i!=j){
        if(i.next==null){i=headB;}
        else{i=i.next;}
        if(j.next==null){j=headA;}
        else{j=j.next;}
        if(i.next==j.next && i.next==null) break;

     }
     if(i==j) return i;
     else{return null;}

     

    }

}
