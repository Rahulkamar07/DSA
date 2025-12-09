class Solution {
    public int specialTriplets(int[] nums) {
        int n = nums.length;
        long MOD = 1_000_000_007;

        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        // Count frequencies in right map
        for (int x : nums)
            right.put(x, right.getOrDefault(x, 0) + 1);

        long result = 0;

        for (int j = 0; j < n; j++) {
            int val = nums[j];

            // Remove current from right map because j cannot be k
            right.put(val, right.get(val) - 1);

            long target = val * 2L;

            long leftCount = left.getOrDefault((int)target, 0);
            long rightCount = right.getOrDefault((int)target, 0);

            result = (result + (leftCount * rightCount) % MOD) % MOD;

            // Add current element to left map
            left.put(val, left.getOrDefault(val, 0) + 1);
        }

        return (int) result;
    }
}
