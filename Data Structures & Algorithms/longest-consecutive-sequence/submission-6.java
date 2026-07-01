class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        after looking at solution
        */
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;

        for(int num : nums){
            if(!set.contains(num-1)){
                int current = 1;
                while(set.contains(num+current)){
                    current++;
                }
                longest = Math.max(longest, current);
            }
        }
        return longest;
    }
}
