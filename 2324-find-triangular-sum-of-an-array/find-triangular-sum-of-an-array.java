class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        
        // Keep reducing the array until only one element remains
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                nums[j] = (nums[j] + nums[j + 1]) % 10;
            }
        }
        
        return nums[0]; // Final result
    }

    // Testing the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(sol.triangularSum(nums1)); // Output: 8
        
        int[] nums2 = {5};
        System.out.println(sol.triangularSum(nums2)); // Output: 5
    }
}
