class Solution {
    /*
    sort array
    same algorithm as subsets 1
        keep track of where you first inserted when encountering a new number
        if duplicate, start inserting from that number instead of the beginning

    */

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>(List.of(nums[0])));

        int insertion = 1;

        for(int i = 1; i < nums.length; i++){
            int length = result.size();
            int j = 0;
            if(nums[i] == nums[i-1]){
                j = insertion;
            }
            insertion = length;
            while(j < length){
                List<Integer> subset = new ArrayList<>(result.get(j));
                subset.add(nums[i]);
                result.add(subset);
                j++;
            }
        }

        return result;
    }
}
