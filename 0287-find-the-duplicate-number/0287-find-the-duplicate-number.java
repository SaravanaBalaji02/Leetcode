class Solution {
    public int findDuplicate(int[] nums) {

     int ans=0;
     for(int i=0;i<nums.length;i++)
     {
        for(int j=nums.length-1;j>=0;j--)
        {
        if(i!=j && nums[i]==nums[j])
        {
            ans=nums[i];
            break;
        }
     }   
     }
     return ans;
    }
}