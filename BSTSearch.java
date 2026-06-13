

import javax.swing.tree.TreeNode;

public class BSTSearch {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode a=root;
        if(a==null) return null;
        if(a.val==val) return a;
        else if(a.val>val){
           return searchBST(a.left,val);
        }
        else{
           return searchBST(a.right,val);
        }

    }
}

