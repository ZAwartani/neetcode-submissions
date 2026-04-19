/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int result = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        hight(root);
        return result;
    }
    public int hight(TreeNode root)
    {
        if(root == null){
            return 0;
        }
        else{
            int lengthleft = hight(root.left);
            int lengthright = hight(root.right);
            result = Math.max(result , lengthleft + lengthright);
            return Math.max(lengthleft , lengthright)+1;
        }
    }
}
