class Solution {
    public String clearDigits(String s) {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
           char c=s.charAt(i);
           if(Character.isDigit(c))
           {
            ans=ans.substring(0,ans.length()-1);
           }
           else
           {
             ans+=c;
           }
        }
        return ans;
    }
}