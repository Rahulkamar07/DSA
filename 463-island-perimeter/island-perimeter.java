class Solution {
    public int islandPerimeter(int[][] grid) 
    {
        int res = 0;
        int r = grid.length;
        int c = grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    res = res+4;
                    if(i>0 && (grid[i-1][j]==1))
                    {
                        res = res-2;
                    }
                    if(j>0 && (grid[i][j-1]==1))
                    {
                        res = res-2;
                    }
                }
            }
        }
        return res;
    }
}