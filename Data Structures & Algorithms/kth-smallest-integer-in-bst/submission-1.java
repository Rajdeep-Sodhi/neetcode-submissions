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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> sorted = new ArrayList<>();
        inOrder(root, sorted);
        return sorted.get(k-1);
    }
    private void inOrder(TreeNode root, List<Integer> sorted){
        if(root == null) return;
        inOrder(root.left, sorted);
        sorted.add(root.val);
        inOrder(root.right, sorted);
    }
    
}
