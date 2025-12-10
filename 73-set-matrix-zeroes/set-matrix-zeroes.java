class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length; //rows
        int m = matrix[0].length; //columns

        int [][] res = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    res[i][j]=-1;
                    //adding rows
                    for(int k=0;k<n;k++)
                    {
                        res[k][j] = -1;
                    }
                    //adding columns
                    for(int k=0;k<m;k++)
                    {
                        res[i][k] = -1;
                    }
                }                
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(res[i][j]==-1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}