class Solution {
    /*
    sort the list
    
    make a decision tree where you include / dont for all indices
        if the total ever goes over, stop
        recusion (include the index)
        recursion (dont include the index)
        move to the next index
    */
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        result = new ArrayList<>();

        decisionTree(nums, target, 0, 0, new ArrayList<>());
        return result;

    }

    public void decisionTree(int[] nums, int target, int total, int index, List<Integer> current){
        if(target == total){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i = index; i < nums.length; i++){
            if(total + nums[i] > target) return;

            current.add(nums[i]);
            decisionTree(nums, target, total + nums[i], i, current);
            current.remove(current.size()-1);
        }
    }
}
