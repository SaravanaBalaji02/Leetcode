class Solution {
    public int countSeniors(String[] details) {
        int ans=0;
        for(int i=0;i<details.length;i++)
        {
            String s=details[i].substring(11,13);
            int n=Integer.parseInt(s);
            if(n>60)
            {
                ans++;
            }
        }
        return ans;
    }
}