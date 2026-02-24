class Solution {
    public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        int n = a1.length;
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            sum += a1[i] - a2[i];
            if(sum == 0)
                maxLen = i + 1;
            if(map.containsKey(sum))
                maxLen = Math.max(maxLen, i - map.get(sum));
            else
                map.put(sum, i);
        }
        return maxLen;
    }
}