class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double res;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int num1: nums1)
        {
            temp.add(num1);
        }
        for(int num2 : nums2)
        {
            temp.add(num2);
        }
        Collections.sort(temp);
        int n = temp.size();
        if(n%2!=0)
        {
            int i = n/2;
            int med = temp.get(i);
            res = med;
        }
        else
        {
            int i = n/2;
            int n1 = temp.get(i-1);
            int n2 = temp.get(i);
            res = (n1+n2)/2.0;
        }
        return res;
    }
}