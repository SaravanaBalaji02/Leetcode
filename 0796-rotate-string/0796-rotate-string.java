class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        char a[]=s.toCharArray();
        while(n!=0)
        {
            char temp=a[0];
            for(int i=0;i<s.length()-1;i++)
            {
                a[i]=a[i+1];
            }
            a[a.length-1]=temp;
            if(goal.equals(new String(a)))
            {
                return true;
            }
            n--;
        }
      return false;
    }
}