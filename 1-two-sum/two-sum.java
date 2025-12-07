class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int res=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    res = nums[i] + nums[j];
                    if(res==target)
                    {
                        arr.add(i);
                        arr.add(j);
                        break;
                    }
                }
            }
        }
        int m = arr.size();
        int []result = new int[m];
        for(int i=0;i<m;i++)
        {
            result[i]=arr.get(i);
        }
        return result;
    }
}