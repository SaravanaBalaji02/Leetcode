class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total=0;
        for(int i=0;i<apple.length;i++)
        {
            total=total+apple[i];
        }
        Arrays.sort(capacity);
        int count=0;
        for(int i=capacity.length-1;i>=0;i--)
        {
          
          
            count++;
        
           total=total-capacity[i];
           if(total<=0)
           {
            break;
           }
        }
        return count;

    }
}