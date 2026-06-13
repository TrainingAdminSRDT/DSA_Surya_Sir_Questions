#include <vector>

// 222. Count Complete Tree Nodes

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class Solution {
public:
    int countNodes(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        }

        return 1 + countNodes(root->left) + countNodes(root->right);
    }

    // 700. Search in a Binary Search Tree
    TreeNode* searchBST(TreeNode* root, int val) {
        while (root != nullptr) {
            if (root->val == val) {
                return root;
            } else if (val < root->val) {
                root = root->left;
            } else {
                root = root->right;
            }
        }

        return nullptr;
    }

    // 701. Insert into a Binary Search Tree
    TreeNode* insertIntoBST(TreeNode* root, int val) {
        if (root == nullptr) {
            return new TreeNode(val);
        }

        if (val < root->val) {
            root->left = insertIntoBST(root->left, val);
        } else {
            root->right = insertIntoBST(root->right, val);
        }

        return root;
    }

    // 1791. Find Center of Star Graph
    int findCenter(const std::vector<std::vector<int>>& edges) {
        if (edges[0][0] == edges[1][0] ||
            edges[0][0] == edges[1][1])
            return edges[0][0];

        return edges[0][1];
    }
};

