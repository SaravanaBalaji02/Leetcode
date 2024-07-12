class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int max=1;
        Arrays.sort(nums);
        if(nums.length==0)

        {
            return 0;
        }
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1]+1)
            {
                count++;

            }
            else if(nums[i]==nums[i-1])
            {
                continue;
            }
             else if(nums[i]!=nums[i-1])
            {
                count=1;
            }
            if(count>max)
            {
                max=count;
            }
          
            
        }
        return max;
    }
}