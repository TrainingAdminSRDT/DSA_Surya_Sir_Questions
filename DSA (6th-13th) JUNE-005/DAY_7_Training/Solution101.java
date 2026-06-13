public class Solution101 {
    public static void main(String[] args) {
        TreeNode r = new TreeNode(1);
        r.left = new TreeNode(2);
        r.right = new TreeNode(2);
        System.out.println(isSymmetric(r));
    }
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }
    private static boolean isMirror(TreeNode a, TreeNode b) {
        if (a == null && b == null) return true;
        if (a == null || b == null || a.val != b.val) return false;
        return isMirror(a.left, b.right) && isMirror(a.right, b.left);
    }
}
