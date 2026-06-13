import javax.swing.tree.TreeNode;

public class CountTreeNodes {
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

    public int countNodes(TreeNode root) {
        int c=1;
        TreeNode a=root;

        if(a==null) return 0;
        if(a.left!=null) {
            c=c+countNodes(a.left);
        }
        if(a.right!=null){
            c+=countNodes(a.right);

        }
        return c;
    }


}
