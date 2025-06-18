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
    int maxDepth(TreeNode* root) {
        int count1=0;
        int count2=0;
        if(root==nullptr){
            return 0;
        }
        count1++;
        count2++;
        count1+=maxDepth(root->left);
        count2+=maxDepth(root->right);
        return count1>count2?count1:count2;
    }
};