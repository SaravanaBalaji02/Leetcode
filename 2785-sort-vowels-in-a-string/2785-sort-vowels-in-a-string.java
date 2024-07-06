class Solution {
    public String sortVowels(String s) {
        List<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                list.add(c);
            }
        }
        Collections.sort(list);
        String a="";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
               char c=s.charAt(i);
              if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                a=a+list.get(j++);
            }
            else
            {
                a=a+c;
            }
        }
        return a;
    }

}