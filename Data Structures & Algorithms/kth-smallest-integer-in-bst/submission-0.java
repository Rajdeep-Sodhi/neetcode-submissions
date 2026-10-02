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
build a sorted list based on the tree and return the k element
    have to use get n times
take all elements of the tree and build them into a min heap
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        addToHeap(root, minHeap);
        for(int i = 0; i < k-1; i++){
            minHeap.poll();
        }
        return minHeap.poll();

    }
    private void addToHeap(TreeNode root, PriorityQueue<Integer> minHeap){
        if(root != null){
            minHeap.add(root.val);
            addToHeap(root.left, minHeap);
            addToHeap(root.right, minHeap);
        }
    }
    
}
