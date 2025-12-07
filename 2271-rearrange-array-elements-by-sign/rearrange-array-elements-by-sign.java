class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                q1.add(nums[i]);
            }
            else
            {
                q2.add(nums[i]);
            }
        }
        int n = nums.length;
        // int []res = new int[n];
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                nums[i]=q1.poll();
            }      
            else
            {
                nums[i]=q2.poll();
            }
        }
        return nums;
    }
}