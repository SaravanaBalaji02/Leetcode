class Solution {
    public int pivotInteger(int n) {
        int frontsum=0;
        int backsum=0;
        int ans=-1;
        for(int mid=1;mid<=n;mid++)
        {
            for(int i=1;i<mid;i++)
            {
             frontsum=frontsum+i;   
            }
            for(int k=mid+1;k<=n;k++)
            {
                backsum=backsum+k;
            }
          
            if(frontsum==backsum)
            {
                ans=mid;
                break;
            }
            frontsum=0;backsum=0;
        }
        System.out.println(frontsum);
        System.out.println(backsum);
        return ans;

    }
}