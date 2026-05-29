class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int digi;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            digi = digitalSum(nums[i]);
            arr.add(digi);
        }
        Collections.sort(arr);
        return arr.get(0);
    }
    public int digitalSum(int d){
        int sum =0;
        while(d>0){
            sum+=d%10;
            d/=10;
        }
        return sum;
    }
}