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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null) 
            q.add(root);
        
        while(!q.isEmpty()){
            result.add(new ArrayList<>());
            for(TreeNode node : q){
                result.get(result.size()-1).add(node.val);
            }
            Queue<TreeNode> newQ = new LinkedList<>();
            for(TreeNode node : q){
                if(node.left != null) 
                    newQ.add(node.left);
                if(node.right != null) 
                    newQ.add(node.right);    
            }
            q = newQ;
        }
        return result;
    }
}
