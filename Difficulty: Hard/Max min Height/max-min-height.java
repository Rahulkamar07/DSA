class Solution {

    public int maxMinHeight(int[] arr, int k, int w) {

        int n = arr.length;
        long low = Integer.MAX_VALUE;
        long high = 0;

        // find minimum
        for (int val : arr) {
            low = Math.min(low, val);
        }

        high = low + k;  // maximum possible height

        long answer = low;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (canAchieve(arr, n, k, w, mid)) {
                answer = mid;
                low = mid + 1;  // try bigger
            } else {
                high = mid - 1;
            }
        }

        return (int) answer;
    }

    private boolean canAchieve(int[] arr, int n, int k, int w, long target) {

        long[] diff = new long[n];
        long operations = 0;
        long currentIncrease = 0;

        for (int i = 0; i < n; i++) {

            if (i >= w)
                currentIncrease -= diff[i - w];

            long currentHeight = arr[i] + currentIncrease;

            if (currentHeight < target) {

                long need = target - currentHeight;
                operations += need;

                if (operations > k)
                    return false;

                currentIncrease += need;

                if (i < n)
                    diff[i] = need;
            }
        }

        return true;
    }
}
