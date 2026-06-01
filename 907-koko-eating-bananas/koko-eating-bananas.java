class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();
        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while(low <= high){
            int mid = (low + high)/2;
            long totalh = calculateTotalH(piles, mid);

            if(totalh<=h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        } 
        return ans;
    }

    public long calculateTotalH(int[] piles, int speed){
        long total =0;
        for(int bananas : piles){
            total += (bananas + (long)speed - 1) / speed;
        }
        return total;
    }
}