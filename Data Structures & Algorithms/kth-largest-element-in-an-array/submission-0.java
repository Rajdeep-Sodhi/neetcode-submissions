class Solution {
    /*
    maintain a min heap

    for every element in array
        if size becomes bigger than k, 
            remove an element
    
    return peek
    */
    
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for(int num : nums){
            minheap.add(num);
            if(minheap.size() > k)
                minheap.poll();
        }

        return minheap.peek();
    }
}
