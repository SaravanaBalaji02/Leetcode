class Solution {
    public double myPow(double x, int n) {
        /*double ans=1;
        boolean isNeg=n<0;
        n=Math.abs(n);
        for(int i=0;i<n;i++)
        {
            ans=ans*x;
        }
        if(isNeg)
        {
            ans=1/ans;
        }
        return ans;*/
        return (double)Math.pow(x,n);
    }
}