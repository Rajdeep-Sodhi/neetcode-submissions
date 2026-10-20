class Solution {
    /*
    result length = sum of n from 2 to n + 2
    for every index, combine it with everything that has come before it including empty set
    
    */
    
    public List<List<Integer>> subsets(int[] nums) {
        int len = 2;
        for(int i = nums.length; i > 1; i--) len += i;

        
        List<List<Integer>> result = new ArrayList<>(len);
        result.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++){
            List<Integer> current = new ArrayList<>(Arrays.asList(nums[i]));
            int length = result.size();
            for(int j = 0; j < length; j++){
                List<Integer> addition = new ArrayList<>(current);
                addition.addAll(result.get(j));
                result.add(addition);
            }
        }

        return result;
    }
}
