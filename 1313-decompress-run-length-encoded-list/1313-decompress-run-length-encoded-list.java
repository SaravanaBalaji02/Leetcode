class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i+=2)
        {
        size=size+nums[i];
        }
        int a[]=new int[size];
        int k=0;
        for(int i=0;i<nums.length;i+=2)
        {
                //Arrays.fill(arrayName, startIndex, endIndex, value);
          
            Arrays.fill(a, k, k+nums[i], nums[i+1]);
            k+=nums[i];
        }
        return a;
    }
}