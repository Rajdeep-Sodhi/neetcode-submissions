class Solution {
    public int maxProfit(int[] prices) {
        /*
        establish a min
        linear iternation   
            calculate the difference between the current element and min
                if greater than bestSell, replace
            else if current element is less than min
                replace min
        */
        int result = 0;
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - min > result) 
                result = prices[i] - min;
            else if(prices[i] < min) 
                min = prices[i];
        }
        return result;
    }
}
