class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int k=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]>nums[i-1])
            {
                k = Math.max(k,i);
            }
        }
        return k;
    }
}