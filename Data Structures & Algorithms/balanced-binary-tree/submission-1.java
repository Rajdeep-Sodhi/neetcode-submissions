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
    public boolean isBalanced(TreeNode root) {
        boolean[] res = new boolean[1];
        res[0] = true;
        height(root, res);
        return res[0];
    }
    private int height(TreeNode root, boolean[] res){
        if(root == null) return 0;
        int left = height(root.left, res);
        int right = height(root.right, res);
        if(Math.abs(left - right) > 1)
            res[0] = false;
        return Math.max(left, right)+1;
    }
}
