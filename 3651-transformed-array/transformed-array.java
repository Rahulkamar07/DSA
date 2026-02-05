class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int move = nums[i];

            // Correct circular index handling
            int newIndex = ((i + move) % n + n) % n;

            res[i] = nums[newIndex];
        }

        return res;
    }
}
