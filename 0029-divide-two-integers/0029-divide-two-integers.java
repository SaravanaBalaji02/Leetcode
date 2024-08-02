class Solution {
    public int divide(int dividend, int divisor) {
      if(dividend==Integer.MIN_VALUE)
      {
        return Integer.MAX_VALUE;
      }

        return dividend/divisor;
    }
}