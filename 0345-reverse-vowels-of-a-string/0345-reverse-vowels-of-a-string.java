class Solution {
    public String reverseVowels(String s) {
        char []a=s.toCharArray();
        List<Character> list=new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u'||a[i]=='i'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
            {
                list.add(a[i]);
            }
        }
        String x="";
        int k=list.size()-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u'||a[i]=='i'||a[i]=='A'||a[i]=='E'||a[i]=='O'||a[i]=='I'||a[i]=='U')
            {
                x=x+list.get(k--);
            }
            else
            {
                x=x+a[i];
            }
        }
        return x;
    }
}