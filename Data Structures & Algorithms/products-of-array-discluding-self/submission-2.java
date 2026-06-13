class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                result[j] *= nums[i];
            }
            for(int j = i+1; j < nums.length; j++){
                result[j] *= nums[i];
            }
        }
        return result;
    }
}  

/*
How to without division
make array of 1s
multiple every index except it's own for all indices

1. Brute force the first number
    if this number is 0, look for an element that isn't 0
        if found brute force that index and return
        else return base array
2. move on to the next index for the rest of the array
    divide by prev element and multi by current element
*/
