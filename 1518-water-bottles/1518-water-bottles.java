class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int ans=numBottles;
      while(numBottles>=numExchange)
      {
        int new=numBottles/numExchange;
        int rem=numBottles%numExchange;
        numBottles=rem+nemBottles;
        ans=ans+new;
      }
      return ans;
    }
}