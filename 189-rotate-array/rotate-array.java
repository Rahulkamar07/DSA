class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;

        k = k % n;  // IMPORTANT FIX

        ArrayList<Integer> t = new ArrayList<>();

        int m = n - k;

        // add last k elements
        for (int i = m; i < n; i++) {
            t.add(nums[i]);
        }

        // add first n-k elements
        for (int i = 0; i < m; i++) {
            t.add(nums[i]);
        }

        // put back into nums
        for (int i = 0; i < n; i++) {
            nums[i] = t.get(i);
        }
    }
}
