class Solution {
    /*
    store all values in a max heap
    take 2 values from heap until heap size is left at one
        if abs(x-y) != 0, put that value back in the heap
    */
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones){
            maxHeap.offer(stone);
        }
        while(maxHeap.size() > 1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            int diff = Math.abs(x-y);
            if(diff > 0)
                maxHeap.offer(diff);
        }
        if(maxHeap.isEmpty())
            return 0;
        return maxHeap.peek();
    }
}
