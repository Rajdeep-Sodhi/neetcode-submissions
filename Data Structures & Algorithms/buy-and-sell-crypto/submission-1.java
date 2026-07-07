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
        for(int price : prices){
            if(price - min > result) 
                result = price - min;
            else if(price < min) 
                min = price;
        }
        return result;
    }
}
