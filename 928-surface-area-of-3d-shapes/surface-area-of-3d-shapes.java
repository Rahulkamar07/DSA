class Solution {
    public int surfaceArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int nele = n*m;
        int sum_v=0,nz=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                sum_v = sum_v+grid[i][j];
                if(grid[i][j]!=0)
                {
                    nz++;
                }
            }
        }
        int iso_total = (4*sum_v)+(2*nz);
        int hidden_total=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(j+1<m)
                {
                    hidden_total += 2*Math.min(grid[i][j],grid[i][j+1]);
                }
                if(i+1<n)
                {
                    hidden_total += 2*Math.min(grid[i][j],grid[i+1][j]);
                }
            }
        }
        int sa = iso_total - hidden_total;
        return sa;
    }
}