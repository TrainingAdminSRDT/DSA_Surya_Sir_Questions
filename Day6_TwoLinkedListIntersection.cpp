struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class twoLinkedListIntersection {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *i = headA;
        ListNode *j = headB;
        while (i != j) {
            if (i->next == nullptr) {
                i = headB;
            } else {
                i = i->next;
            }
            if (j->next == nullptr) {
                j = headA;
            } else {
                j = j->next;
            }
            if (i->next == j->next && i->next == nullptr) break;
        }
        if (i == j) return i;
        else return nullptr;
    }
};
