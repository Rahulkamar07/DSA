class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int n = happiness.length;
        int dec = 0;

        for (int i = n - 1; i >= 0 && k > 0; i--) {
            int val = happiness[i] - dec;
            if (val > 0) {
                sum += val;
            }
            dec++;
            k--;
        }
        return sum;
    }
}
