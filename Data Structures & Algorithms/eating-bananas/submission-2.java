class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        /*
        obtain the max in piles
        binary search between 1 and max
            linearly calculate if that value can eat up everything
                be sure to round up when calculating time
            if less than output, replace
        return output
        */
        int min = 1;
        int max = Arrays.stream(piles).max().getAsInt();
        if(piles.length == h)
            return max;
        while(min <= max){
            int mid = (max+min)/2;
            int time = 0;
            for(int pile : piles)
                time += (pile + mid -1) / mid;
            if(time > h)
                min = mid+1;
            else{
                max = mid-1;
            }
        }
        return max+1;
    }
}
