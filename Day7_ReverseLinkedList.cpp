struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int val) : val(val), next(nullptr) {}
    ListNode(int val, ListNode *next) : val(val), next(next) {}
};

class ReverseLinkedList {
public:
    ListNode* reverseList(ListNode* head) {
        if (head == nullptr || head->next == nullptr) return head;
        ListNode *i = head;
        ListNode *j = i->next;
        while (j->next != nullptr) {
            ListNode *temp = j->next;
            j->next = i;
            i = j;
            j = temp;
        }
        j->next = i;
        head->next = nullptr;
        return j;
    }
};
