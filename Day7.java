// 160  Intersection of two Linked Lists

 
public class Day7 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA;
        ListNode pB=headB;
        while(pA!=pB){
            pA=(pA==null)? headB:pA.next;
            pB=(pB==null)? headA:pB.next;
            }
        
        return pA;
        
    }
}


// 141 Linked List Cycle


public class Solution {
    public boolean hasCycle(ListNode head) {
       ListNode fast=head; ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
            return true;
            }
        }
        
        return false;
    }    
}



// 206  Reverse Linked List

    class Solution {
      public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; 
            curr.next = prev;          
            prev = curr;               
            curr = next;               
        }
        return prev;
    }
}



// 876 Middle of the Linked List



class Solution {
    public ListNode middleNode(ListNode head) {
        
        ListNode slow= head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
        
    

// 104  Maximum Depth of Binary Tree



class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
        
    }
}



// 100  Same Tree



class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        
        if (p == null && q == null) {
            return true;
        }

        
        if (p == null || q == null) {
            return false;
        }

        
        if (p.val != q.val) {
            return false;
        }

        
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
        
    

// 101 Symmetric Tree


class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}
        
    
