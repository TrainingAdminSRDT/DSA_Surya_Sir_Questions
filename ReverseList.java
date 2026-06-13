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
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;

        ListNode nnn = head;
        ListNode mmm = head.next;
        nnn.next=null;
        while(mmm!=null){
            ListNode temp = mmm.next;
            mmm.next = nnn;
            nnn=mmm;
            mmm=temp;

        }
        return nnn;
    }
}