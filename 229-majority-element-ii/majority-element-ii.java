class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int r = n/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()>r)
            {
                arr.add(entry.getKey());
            }
        }
        return arr;
    }
}