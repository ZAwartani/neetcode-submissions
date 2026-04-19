// struct ListNode
// {
//     int val;
//     ListNode* next;

//     ListNode() : val(0), next(nullptr), prev(nullptr) {}
//     ListNode(int val) : val(val), next(nullptr), prev(nullptr) {}
//     ListNode(int val, ListNode* next, ListNode* prev)
//         : val(val), next(next), prev(prev) {}
// };

class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if (!head || left == right) return head;

        ListNode* cur = head;
        int idx = 1;

        stack<int> st;

        while (idx < left) {
            cur = cur->next;
            idx++;
        }

        ListNode* temp = cur;
        while (idx >= left && idx <= right) {
            st.push(temp->val);
            temp = temp->next;
            idx++;
        }

        while (!st.empty()) {
            cur->val = st.top();
            st.pop();
            cur = cur->next;
        }

        return head;
    }
};