struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class CountTreeNodes {
public:
    int countNodes(TreeNode* root) {
        int c = 1;
        TreeNode *a = root;
        if (a == nullptr) return 0;
        if (a->left != nullptr) {
            c = c + countNodes(a->left);
        }
        if (a->right != nullptr) {
            c += countNodes(a->right);
        }
        return c;
    }
};
