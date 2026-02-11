import java.util.*;

class Solution {
    public int minCost(int[] heights, int[] cost) {
        
        int n = heights.length;
        
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = heights[i];
            arr[i][1] = cost[i];
        }
        
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
 
        long totalCost = 0;
        for(int i = 0; i < n; i++) {
            totalCost += arr[i][1];
        }
     
        long cumulativeCost = 0;
        int targetHeight = 0;
        
        for(int i = 0; i < n; i++) {
            cumulativeCost += arr[i][1];
            if(cumulativeCost >= (totalCost + 1) / 2) {
                targetHeight = arr[i][0];
                break;
            }
        }
    
        long result = 0;
        for(int i = 0; i < n; i++) {
            result += (long)Math.abs(heights[i] - targetHeight) * cost[i];
        }
        
        return (int) result;
    }
}
