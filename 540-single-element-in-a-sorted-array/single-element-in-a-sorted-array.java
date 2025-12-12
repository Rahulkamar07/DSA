class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int num : nums)
        {
            res.put(num,res.getOrDefault(num,0)+1);
        }
        for(int key: res.keySet())
        {
            if(res.get(key)==1)
            {   
                return key;
            }
        }
        return 0;
    }
}