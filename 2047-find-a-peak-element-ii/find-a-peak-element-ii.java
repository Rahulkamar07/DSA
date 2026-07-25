class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int maxValue = 0;
        int []ans = new int[2];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                maxValue = Math.max(maxValue,mat[i][j]);
            }
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==maxValue){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }
}