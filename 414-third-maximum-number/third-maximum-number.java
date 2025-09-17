import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); // ascending order
        int n = nums.length;
        int distinctCount = 1; // nums[n-1] is the first distinct max
        int res = nums[n-1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinctCount++;
                res = nums[i];
            }
            if (distinctCount == 3) {
                return res; // found 3rd distinct max
            }
        }

        // If fewer than 3 distinct, return max
        return nums[n - 1];
    }
}
