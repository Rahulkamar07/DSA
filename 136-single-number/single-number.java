class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            int count=0;
            int p = nums[i];
            for(int j=0;j<n;j++)
            {
                if(p==nums[j] && i!=j)
                {
                    count++;
                }
            }
            if(count==0)
            {
                return p;
            }
        }        
        return -1;
    }
}