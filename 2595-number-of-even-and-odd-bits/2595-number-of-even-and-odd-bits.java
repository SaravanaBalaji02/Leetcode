class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int a[]=new int[2];
        int even=0,odd=0;
        String rev="";
    
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        for(int i=0;i<rev.length();i++)
        {
          if(rev.charAt(i)=='1' && i%2==0)
          {
            even++;
          }
          else if(rev.charAt(i)=='1' && i%2!=0)
          {
              odd++;
          }
      
         
       
        }
            a[0]=even;
          a[1]=odd;
         return a;
    }
}