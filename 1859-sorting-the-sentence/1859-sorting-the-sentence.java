class Solution {
    public String sortSentence(String s) {
        String[] a=s.split(" ");
        String[] ans=new String[a.length];
        for(int i=0;i<a.length;i++)
        {
            int n=a[i].charAt(a[i].length()-1)-'0';
            ans[n-1]=a[i].substring(0,a[i].length()-1);
        }
        String res="";
        for(int i=0;i<ans.length-1;i++)
        {
            res=res+ans[i]+" ";
        }
        res=res+ans[ans.length-1];
        return res;

    }
}