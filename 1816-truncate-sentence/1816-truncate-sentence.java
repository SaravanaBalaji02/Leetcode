class Solution {
    public String truncateSentence(String s, int k) {
        String[] b=s.split(" ");
        String a ="";
        for(int i=0;i<k-1;i++)
        {  
            a=a+b[i]+" ";
             
        }
        a=a+b[k-1];
        return a;
    }
}