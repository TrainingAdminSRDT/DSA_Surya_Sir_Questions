#include <iostream>
#include <vector>
#include <string>
#include <sstream>
using namespace std;

struct ListNode {
    int val;
    ListNode* next;
    ListNode(int x) : val(x), next(NULL) {}
};

/*
141. Linked List Cycle
Definition for singly-linked list.
*/

class Solution {
public:
    // 141. Linked List Cycle
    bool hasCycle(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;

        while (fast != NULL && fast->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // 206. Reverse Linked List
    ListNode* reverseList(ListNode* head) {
        ListNode* prev = NULL;
        ListNode* curr = head;

        while (curr != NULL) {
            ListNode* nextNode = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    // 876. Middle of the Linked List
    ListNode* middleNode(ListNode* head) {
        ListNode* slow = head;
        ListNode* fast = head;

        while (fast != NULL && fast->next != NULL) {
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }
};

// Push Pop Operations
int main() {
    vector<int> lst;
    string input;
    
    cout << "Enter elements: ";
    getline(cin, input);
    
    // Parse input
    stringstream ss(input);
    int num;
    while (ss >> num) {
        lst.push_back(num);
    }

    cout << "Initial List: ";
    for (int x : lst) cout << x << " ";
    cout << endl;

    cout << "Element to push: ";
    int x;
    cin >> x;
    lst.push_back(x);

    cout << "After Push: ";
    for (int x : lst) cout << x << " ";
    cout << endl;

    if (!lst.empty()) {
        int removed = lst.back();
        lst.pop_back();
        cout << "Popped Element: " << removed << endl;
        cout << "After Pop: ";
        for (int x : lst) cout << x << " ";
        cout << endl;
    } else {
        cout << "List is empty" << endl;
    }

    return 0;
}

// queue example

#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<char> q;

    // Enqueue
    q.push('b');
    q.push('a');
    q.push('d');
    q.push('e');

    cout << "Front element: " << q.front() << endl;

    // Dequeue
    q.pop();

    cout << "After pop, front element: " << q.front() << endl;

    return 0;
}

// 104. Maximum Depth of Binary Tree

/**
 * Definition for a binary tree node.
 */
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution {
public:
    int maxDepth(TreeNode* root) {
        if (root == nullptr) {
            return 0;
        }

        int leftDepth = maxDepth(root->left);
        int rightDepth = maxDepth(root->right);

        return 1 + max(leftDepth, rightDepth);
    }
};

// 100. Same Tree
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right)
 *         : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if (p == nullptr && q == nullptr)
            return true;

        if (p == nullptr || q == nullptr)
            return false;

        if (p->val != q->val)
            return false;

        return isSameTree(p->left, q->left) &&
               isSameTree(p->right, q->right);
    }
};



// 101. Symmetric Tree

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right)
 *         : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    bool isMirror(TreeNode* left, TreeNode* right) {
        if (left == nullptr && right == nullptr)
            return true;

        if (left == nullptr || right == nullptr)
            return false;

        if (left->val != right->val)
            return false;

        return isMirror(left->left, right->right) &&
               isMirror(left->right, right->left);
    }

    bool isSymmetric(TreeNode* root) {
        return isMirror(root->left, root->right);
    }
};