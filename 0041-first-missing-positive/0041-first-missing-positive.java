class Solution {
    public int firstMissingPositive(int[] nums) {
           
           HashSet<Integer> set=new HashSet<>();
           for(int i=0;i<nums.length;i++)
           {
            if(nums[i]>0)
            {
                set.add(nums[i]);
            }
           }
           int j=1;
          for(int num:set)
          {
            if(set.contains(j))
            {
                j++;
            }
          }
          return j;
    }
}