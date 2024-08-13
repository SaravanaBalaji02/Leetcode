class Solution {
    public String countAndSay(int n) {
        String str1="1";
        
        for(int i=0;i<n-1;i++)
        {
            String str2="";
            int count=1;int  j;
            for( j=0;j<str1.length()-1;j++)
            {
                if(str1.charAt(j)==str1.charAt(j+1))
                {
                    count++;
                }
                else
                {
                   
                    str2=str2+count;
                    str2=str2+str1.charAt(j);
                     count=1;

                }
            }
            str2=str2+count;
            str2=str2+str1.charAt(j);
            str1=str2;
        }
        return str1;
    }
}