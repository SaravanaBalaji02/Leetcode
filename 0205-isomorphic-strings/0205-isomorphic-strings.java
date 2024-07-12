class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            set1.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++)
        {
            set2.add(t.charAt(i));
        }
        if(set1.size()==set2.size())
        {
            return true;
        }
        return false;


    }
}