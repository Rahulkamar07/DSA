class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                res.add(arr[i]);
            }
        }

        int i = 0;

        for(int num : res) {
            arr[i++] = num;
        }

        while(i < n) {
            arr[i++] = 0;
        }
    }
}