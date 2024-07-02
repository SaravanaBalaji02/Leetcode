class Solution {
    public int dominantIndex(int[] nums) {
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j&& nums[j]*2<=nums[i])
                {
                    count++;
                }
            }
            if(count==nums.length-1)
            {
                return i;
            }
        }
        return -1;
    }
}