/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) 
    {
        if (!p && !q) return true;
        if (!p || !q) return false;

        queue<TreeNode*> qp;
        queue<TreeNode*> qq;

        qp.push(p);
        qq.push(q);

        while (!qp.empty() && !qq.empty())
        {
            TreeNode* n1 = qp.front(); qp.pop();
            TreeNode* n2 = qq.front(); qq.pop();

            if (n1->val != n2->val) return false;

            if ((n1->left == nullptr) != (n2->left == nullptr)) return false;
            if (n1->left) {
                qp.push(n1->left);
                qq.push(n2->left);
            }

            if ((n1->right == nullptr) != (n2->right == nullptr)) return false;
            if (n1->right) {
                qp.push(n1->right);
                qq.push(n2->right);
            }
        }

        return qp.empty() && qq.empty();
    }
};