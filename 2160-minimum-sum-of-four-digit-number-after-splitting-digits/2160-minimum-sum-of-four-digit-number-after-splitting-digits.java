class Solution {
    public int minimumSum(int num) {
        int ans[]=new int[4];
        int i=0;
        while(num!=0)
        {
            ans[i]=num%10;
            num=num/10;
            i++;
        }
        Arrays.sort(ans);

        int a1=ans[0]*10+ans[2];
        int b1=ans[1]*10+ans[3];
        return a1+b1;
    }
}