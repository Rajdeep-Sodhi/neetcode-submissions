class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        after looking at solution
        */
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 1;

        for(int num : nums){
            if(!set.contains(num-1)){
                int current = 1;
                while(set.contains(num+1)){
                    current++;
                    num++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }
}
