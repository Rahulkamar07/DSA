import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        
        int n = citations.length;
        Arrays.sort(citations); 
        
        int h = 0;
        
        for(int i = 0; i < n; i++) {
            if(citations[n - 1 - i] > i) {
                h++;
            } else {
                break;
            }
        }
        
        return h;
    }
}