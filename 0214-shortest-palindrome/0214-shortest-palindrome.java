class Solution {
    public String shortestPalindrome(String s) {
        
          StringBuilder sb=new StringBuilder(s);
          sb.reverse();
          for(int i=0;i<s.length();i++)
          {
            if(s.startsWith(sb.substring(i)))
            {
                return sb.substring(0,i)+s;
            }
          }
          return "";

    }
}