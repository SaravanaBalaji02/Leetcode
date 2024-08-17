class Solution {
    public String largestNumber(int[] nums) {
   
      String str[]=new String[nums.length];
      for(int i=0;i<str.length;i++)
      {
        str[i]=Integer.toString(nums[i]);
      }
     for(int i=0;i<str.length;i++)
     {
        for(int j=i+1;j<str.length-i-1;j++)
        {
            String s1=str[j]+str[j+1];
            String s2=str[j+1]+str[j];
            if(compare(s1,s2)<0)
            {
                String temp=str[j];
                str[j]=str[j+1];
                str[j+1]=temp;
            }
        }
     }
      StringBuilder sb=new StringBuilder("");
      for(int i=nums.length-1;i>=0;i--)
      {
        sb.append(str[i]);
      }
      if(sb.charAt(0)=='0')
      {
       return "0";
      }
      return new String(sb);

}


public static int compare(String s1,String s2)
{
    int len=Math.min(s1.length(),s2.length());
    for(int i=0;i<len;i++)
    {
        char c1=s1.charAt(i);
        char c2=s2.charAt(i);
        if(c1>c2)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    if(s1.length()>s2.length())
    {
        return 1;
    }
    else if(s1.length()<s2.length())
    {
        return -1;
    }
    else
    {
        return 0;
    }
}
}