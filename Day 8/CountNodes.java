class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class CountNodes {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }      
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);      
        if (leftHeight == rightHeight) {
            return (1 << leftHeight) - 1;
        }   
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    private int getLeftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
    private int getRightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        CountNodes solver = new CountNodes();
        int totalNodes = solver.countNodes(root);
        System.out.println("Total Nodes: " + totalNodes);
    }
}
