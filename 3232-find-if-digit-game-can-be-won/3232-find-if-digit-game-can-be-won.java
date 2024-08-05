class Solution {
    public boolean canAliceWin(int[] nums) {
        int singledigit=0;
        int doubledigit=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                doubledigit+=nums[i];
            }
            else
            {
                singledigit+=nums[i];
            }
        }
        if(doubledigit==singledigit)
        {
            return false;
        }
        return true;
    }
}