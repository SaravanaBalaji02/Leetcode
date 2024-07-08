class Solution {
    public int findChampion(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            int count=0;
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                }
            }
            if(count==grid.length-1)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
}