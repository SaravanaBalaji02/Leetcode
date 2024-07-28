class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int i=n-1;
        if(digits[i]!=9)
        {
            digits[i]++;
            return digits;
        }
        while(i!=-1&& digits[i]==9)
        {
            i--;
        }
        if(i==-1)
        {
            int arr[]=new int[n+1];
            arr[0]=1;
            return arr;
        }
        else
        {
            digits[i]++;
            for( i=i+1;i<n;i++)
            {
                digits[i]=0;
            }
            return digits;
        }
    }
}