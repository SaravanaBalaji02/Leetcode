class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int[] arr = new int[n];
        int  x=0;
        for(int i=1;i<n+1;i++){
            x = x^i;
        }
        for(int i=1;i<n-1;i+=2){
            x=encoded[i]^x;
        }
        arr[0] = x;
        for(int i=0;i<n-1;i++){
            arr[i+1]=encoded[i]^arr[i];
        }

        return arr;
        
    }
}