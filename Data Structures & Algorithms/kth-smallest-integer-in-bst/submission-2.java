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
if right side of root, add to root else add root-1
 */

class Solution {
    private int count = 0;
    private int answer;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k); 
        return answer;
    }
    private void inOrder(TreeNode root, int k) {
        if (root == null) return;
        inOrder(root.left, k);
        count++;
        if (count == k) {
            answer = root.val;
            return;
        }
        inOrder(root.right, k);
    }
    
}
