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

 /*
dfs
if value of children is greater than current, add one and move down until it is null
 */

class Solution {
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        int[] res = {0};
        helper(root, root, res);
        return res[0];
    }
    private void helper(TreeNode high, TreeNode curr, int res[]){
        if(curr != null){
            if(curr.val >= high.val){
                res[0] += 1;
                high = curr;
            }
            helper(high, curr.left, res);
            helper(high, curr.right, res);
        }
    }
}
