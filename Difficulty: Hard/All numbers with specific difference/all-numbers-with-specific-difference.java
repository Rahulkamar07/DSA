class Solution {
    public int getCount(int n, int d) {
        // code here
        int left =1;
        int right =n;
        int firstValid = -1;
        while(left<=right)
        {
            int mid = left+(right-left)/2;
            if(mid-digitSum(mid)>=d)
            {
                firstValid =mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        if(firstValid==-1) return 0;
        return n-firstValid +1;
    }
    private int digitSum(int num)
    {
        int sum =0;
        while(num>0)
        {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
};