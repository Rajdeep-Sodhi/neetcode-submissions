class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int firstProduct = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                for(int j = i+1; j < nums.length; j++){
                    firstProduct *= nums[j];
                }
                result[i] = firstProduct;
                return result;
            }
            firstProduct *= nums[i];
        }
        result[0] = firstProduct / nums[0];
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i-1] / nums[i] * nums[i-1];
        }
        return result;
    }
}  

/*
1. Brute force the first number
    if this number is 0, look for an element that isn't 0
        if found brute force that index and return
        else return base array
2. move on to the next index for the rest of the array
    divide by prev element and multi by current element
*/
