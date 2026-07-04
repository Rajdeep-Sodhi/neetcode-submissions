class Solution {
    public int maxArea(int[] heights) {
        /*
        pointers left and right
        len = right - left
        while l & r dont overlap
            calculate area
                if greater replace max
            if r > l
                l++
            else 
                r--
        */
        int l = 0;
        int r = heights.length-1;
        int max = 0;
        while(l < r){
            int left = heights[l];
            int right = heights[r];
            int area = Math.min(heights[l], heights[r]) * (r - l);
            max = Math.max(max, area);
            if(heights[l] > heights[r]){
                r--;
                while(heights[r] < right) r--;
            }
            else{
                l++;
                while(heights[l] < left) l++;
            }
        }
        return max;
    }
}
