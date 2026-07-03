class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        outer loop iternate through 0 to n-2 elements
            inner loop uses left and right pointers from i to n
                2 sum pointer code
        */
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        int i = 0;
        while(i < len-2){
            int current = nums[i];
            int l = i+1;
            int r = len-1;
            while(l < r){
                if(-current < nums[l] + nums[r]){
                    r--;
                }
                else if(-current > nums[l] + nums[r]){
                    l++;
                }
                else{
                    result.add(Arrays.asList(current, nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) l++;
                }
            }
            i++;
            while(i < len-2 && nums[i] == nums[i-1]) i++;
        }
        return result;
    }
}
