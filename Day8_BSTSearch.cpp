#include <cstddef>

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class BSTSearch {
public:
    TreeNode* searchBST(TreeNode* root, int val) {
        TreeNode *a = root;
        if (a == nullptr) return nullptr;
        if (a->val == val) return a;
        else if (a->val > val) {
            return searchBST(a->left, val);
        } else {
            return searchBST(a->right, val);
        }
    }
};
