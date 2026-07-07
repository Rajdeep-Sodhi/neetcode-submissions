class Solution {
    public int maxProfit(int[] prices) {
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
