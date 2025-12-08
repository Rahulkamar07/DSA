class Solution {
    public void nextPermutation(int[] nums) 
    {
        int index=-1;
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for (int num : nums) {
            arr.add(num);
        }
        for(int i=n-2;i>=0;i--)
        {
            if(arr.get(i)<arr.get(i+1))
            {
                index = i;
                break;
            }
        }        
        if(index ==-1)
        {
            Collections.reverse(arr);
            for (int i = 0; i < n; i++) 
            {
                nums[i] = arr.get(i);
            }
            return;
        }
        for(int i=n-1;i>index;i--)
        {
            if(arr.get(i)>arr.get(index))
            {
                Collections.swap(arr,i,index);
                break;
            }
        }
        Collections.reverse(arr.subList(index + 1, n));
        for(int i=0;i<n;i++)
        {
            nums[i]=arr.get(i);
        }
    }
}