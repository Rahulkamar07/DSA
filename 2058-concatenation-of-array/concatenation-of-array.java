class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int m = 2*n;
        int []res = new int[m];
        System.arraycopy(nums,0,res,0,n);
        System.arraycopy(nums,0,res,n,n);
        return res;
    }
}