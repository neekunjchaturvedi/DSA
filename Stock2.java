class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;
        int j=0;
        for(int i=1;i<n;i++){
            if(prices[i]-prices[j]>0){
                profit+=prices[i]-prices[j];
            }
            j++;
        }
        return profit;
    }
}
