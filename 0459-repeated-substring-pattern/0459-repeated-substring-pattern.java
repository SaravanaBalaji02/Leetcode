class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String x=s+s;
        String sub=x.substring(1,x.length()-1);
        return sub.contains(s);

    }
}