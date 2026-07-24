class Solution {
    public int findKthPositive(int[] arr, int k) {
        int j = 1;
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            while (j < arr[i]) {
                num.add(j);
                j++;
            }
            j++;
        }

        // Continue after the last element
        while (num.size() < k) {
            num.add(j);
            j++;
        }

        return num.get(k - 1);
    }
}