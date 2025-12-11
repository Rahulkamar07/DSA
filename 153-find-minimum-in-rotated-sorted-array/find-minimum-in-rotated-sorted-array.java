class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int temp = nums[0];
        for(int i=0;i<n;i++)
        {
            temp = Math.min(temp,nums[i]);
        }
        return temp;
    }
}