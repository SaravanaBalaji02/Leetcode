class Solution {
    public int[] finalPrices(int[] prices) {
        int a[]=new int[prices.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(prices[j]<=prices[i])
                {
                    prices[i]=prices[i]-prices[j];
                    break;
                }
               
               
            }
        }
        return prices;
    }
}