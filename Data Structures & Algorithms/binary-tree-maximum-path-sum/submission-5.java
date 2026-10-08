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
helper
if null return 0
add up sum and compare it to an arg from helper
    if greater replace it
return root val + max(children)
*/
class Solution {
    public int maxPathSum(TreeNode root) {
        int[] res = {root.val};
        int result = helper(root, res);
        return res[0];
    }
    private int helper(TreeNode root, int[] max){
        if(root == null) return 0;
        int left = helper(root.left, max);
        int right = helper(root.right, max);
        int sum = root.val;
        if(left > 0) sum += left;
        if(right > 0) sum += right;
        if(sum > max[0]) max[0] = sum;
        return root.val + Math.max(Math.max(left, right), 0);
    }
}
