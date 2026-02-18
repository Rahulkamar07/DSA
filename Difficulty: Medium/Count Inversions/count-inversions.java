import java.util.*;

class Solution {

    static int inversionCount(int arr[]) {
        int n = arr.length;

        // Coordinate Compression (to handle large values)
        int[] temp = arr.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank++);
            }
        }

        int[] fenwick = new int[n + 1];
        int invCount = 0;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            int r = map.get(arr[i]);

            // Count smaller elements
            invCount += query(fenwick, r - 1);

            // Update current element frequency
            update(fenwick, r, 1);
        }

        return invCount;
    }

    static void update(int[] fenwick, int i, int val) {
        while (i < fenwick.length) {
            fenwick[i] += val;
            i += i & (-i);
        }
    }

    static int query(int[] fenwick, int i) {
        int sum = 0;
        while (i > 0) {
            sum += fenwick[i];
            i -= i & (-i);
        }
        return sum;
    }
}
