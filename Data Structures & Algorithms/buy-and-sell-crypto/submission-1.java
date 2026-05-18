class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit=0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int price = prices[j]-prices[i];
        //         maxProfit=Math.max(maxProfit,price);
        //     }
        // }
        // optimize solution
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                // set the min price
                minPrice = prices[i];
            }
            // check the profit and compare with max
            int profit = prices[i]-minPrice;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
