class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
        int []sorted = arr.clone();
        Arrays.sort(sorted);
        int temp = sorted[0];
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(temp == arr[i])
            {
                k=i;
                break;
            }
        }
        return k;
    }
}