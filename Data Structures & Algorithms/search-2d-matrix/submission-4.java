class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
        binary search the first index of every row
            instead of while (left <= right) change it to left < right
            instead of right = mid-1, right = mid
        once you have the right row, begin binary search within that row
        */

        int top = 0;
        int bottom = matrix.length-1;
        while(top < bottom){
            int mid = top + (bottom-top)/2;
            if(matrix[mid][matrix[0].length-1] < target)
                top = mid+1;
            else if(matrix[mid][0] > target)
                bottom = mid-1;
            else
                break;
        }

        if(top > bottom) return false;

        int row = (top+bottom)/2;
        int left = 0;
        int right = matrix[0].length-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] < target)
                left = mid + 1;
            else if(matrix[row][mid] > target)
                right = mid - 1;
            else
                return true;
        }
        return false;
    }
}
