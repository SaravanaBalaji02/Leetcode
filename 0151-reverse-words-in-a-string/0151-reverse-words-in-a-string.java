class Solution {
    public String reverseWords(String s) {
      String a[]=s.trim().split("\\s+");
      String ans="";
      for(int i=a.length-1;i>0;i--)
      {
           ans=ans+a[i]+" ";
      }
      return ans+a[0];
    }
}