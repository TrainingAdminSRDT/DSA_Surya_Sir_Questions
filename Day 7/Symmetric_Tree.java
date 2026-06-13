class Solution {
  public boolean isSymmetric(TreeNode root) {
          return rec(root.left,root.right);
        
    }
    private boolean rec(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return true;
        }
         if(root1 == null || root2 == null){
            return false;
         }
         if(root1.val!= root2.val){
            return false;
         }
         boolean l = rec(root1.left,root2.right);
         boolean r = rec(root1.right,root2.left);
         return l&&r;
       
    }
        
    
}