class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    /*
    queue
        if the value being removed from the window is the first in our queue delete it

    */
        Deque<Integer> q = new LinkedList<>();
        int len = nums.length;
        int[] result = new int[len+1-k];
        int l = 0, r = 0;

        while(r < len){
            while(!q.isEmpty() && nums[q.getLast()] < nums[r])
                q.removeLast();
            q.addLast(r);

            if (l > q.getFirst()) {
                q.removeFirst();
            }

            if ((r + 1) >= k) {
                result[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }
        return result;

    }
}
