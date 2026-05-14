class Solution {
    public boolean isGood(int[] nums) {
        int maxele = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            maxele = Math.max(maxele, nums[i]);
        }

        // max element must be n-1
        if(maxele != n - 1) {
            return false;
        }

        int[] freq = new int[maxele + 1];

        for(int i = 0; i < n; i++) {
            // invalid number
            if(nums[i] > maxele || nums[i] < 1) {
                return false;
            }

            freq[nums[i]]++;
        }

        // 1 to maxele-1 should appear once
        for(int i = 1; i < maxele; i++) {
            if(freq[i] != 1) {
                return false;
            }
        }

        // maxele should appear twice
        return freq[maxele] == 2;
    }
}