class Solution {
    public int findMin(int[] nums) {
        /*
        edge case if right end is greater than left end
            return left end

        binary search
            if mid is less than prev
                return that value
            if mid is greater than current left end, mark that as the new left end
            if mid is less than current left end mark that as the new right end
        */

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = (left+right)/2;
            if(nums[mid] < nums[right])
                right = mid;
            else
                left = mid+1;
        }

        return nums[left];
    }
}
