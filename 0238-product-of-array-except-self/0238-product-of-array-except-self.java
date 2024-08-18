class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[]=new int[nums.length];
        int prefprod=1;
        prefix[0]=1;
        for(int i=1;i<nums.length;i++)
        {
           
            prefprod=prefprod*nums[i-1];
             prefix[i]=prefprod;
        }
        int suffix[]=new int[nums.length];
        int suffprod=1;
        suffix[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            suffprod=suffprod*nums[i+1];
            suffix[i]=suffprod;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=suffix[i]*prefix[i];
        }
        return nums;
    }
}