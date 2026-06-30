class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        sort
        for all elements
            if incremental, increment max
            if more than incremental reset the increment
        return max
        */
        if(nums.length == 0 || nums.length == 1) return nums.length;
        Arrays.sort(nums);
        int longest = 1;
        int current = 1;

        for(int i = 0; i < nums.length-1; i++){
            int difference = nums[i+1] - nums[i];
            if(difference == 1) current++;
            else if(difference > 1){
                if(current > longest){
                    longest = current;
                }
                current = 1;
            }
        }
        return Math.max(current, longest);
    }
}
