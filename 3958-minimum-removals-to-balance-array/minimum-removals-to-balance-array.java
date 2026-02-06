class Solution {
    public int minRemoval(int[] nums, int k) 
    {
        int n = nums.length;
        Arrays.sort(nums);

        int left = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            while ((long) nums[i] > (long) nums[left] * k) {
                left++;
            }
            int currLen = i - left + 1;
            maxLen = Math.max(maxLen, currLen);
        }

        return n - maxLen;
    }
}
