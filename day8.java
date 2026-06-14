day8.java
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
class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
        
    }
}

//search in binary tree
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
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root== null || root.val== val) return root;
        if(val<root.val){
            return searchBST(root.left,val);
        }else{
             return searchBST(root.right,val);
        }
    }
}  


//insert into binary search tree
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
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
         if(root ==  null ) return new TreeNode(val);
         if(val < root.val ){
            root.left = insertIntoBST(root.left, val);
            
         }
         else{
             root.right = insertIntoBST(root.right, val);
         }
         return root;

        
    }
}

// find center of star graph
class Solution {
    public int findCenter(int[][] edges) {

        int a = edges[0][0];
        int b = edges[0][1];
        if(a == edges[1][0] || a == edges[1][1]){
            return a;
        }else{
            return b;
        }


        
    }
}
      