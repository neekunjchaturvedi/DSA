class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int mx=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else if(prices[i]-min>mx){
                mx=max(prices[i]-min,mx);
            }
        }
        if(mx>0){
            return mx;
        }return 0;
        
    }
    public static int max(int a,int b){
        if(a>b){
            return a;
        }
        return b;
    }
}