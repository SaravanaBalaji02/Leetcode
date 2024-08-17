class Solution {
    public String largestNumber(int[] nums) {
   
      String str[]=new String[nums.length];
      for(int i=0;i<str.length;i++)
      {
        str[i]=Integer.toString(nums[i]);
      }
      Arrays.sort(str,(s1,s2)->(s1+s2).compareTo(s2+s1));
      StringBuilder sb=new StringBuilder("");
      for(int i=nums.length-1;i>=0;i--)
      {
        sb.append(str[i]);
      }
      if(sb.charAt(i)=='0')
      {
       return "0";
      }
      return new String(sb);

}
}