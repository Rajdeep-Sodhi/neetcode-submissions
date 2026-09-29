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
if one node goes left and the other goes right OR one of the nodes equal the current node, return
else
    if both nodes go left, move left
else 
    move right
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int diffP = root.val - p.val;
        int diffQ = root.val - q.val;
        if(diffP < 0 && diffQ < 0){
            return lowestCommonAncestor(root.right, p, q);
        }
        if(diffP > 0 && diffQ > 0){
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }
    
}
