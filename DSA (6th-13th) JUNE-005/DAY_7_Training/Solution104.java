public class Solution104 {
    public static void main(String[] args) {
        TreeNode r = new TreeNode(1);
        r.left = new TreeNode(2);
        r.right = new TreeNode(3);
        System.out.println(maxDepth(r));
    }
    static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
