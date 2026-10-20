class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        int len = (int) Math.pow(2, nums.length);

        List<List<Integer>> result = new ArrayList<>(len);
        result.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++){
            int length = result.size();
            for(int j = 0; j < length; j++){
                List<Integer> subset = new ArrayList<>(result.get(j));
                subset.add(nums[i]);
                result.add(subset);
            }
        }

        return result;
    }
}
