class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0; j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    if(temp.isEmpty())
                    {
                        temp.add(nums2[i]);
                    }
                    else if(!temp.contains(nums2[i]))
                    {
                        temp.add(nums2[i]);
                    }
                    else
                    {
                        //do nothing
                    }
                }
            }
        }        

        int n = temp.size();
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]= temp.get(i);
        }

        return res;
    }
}