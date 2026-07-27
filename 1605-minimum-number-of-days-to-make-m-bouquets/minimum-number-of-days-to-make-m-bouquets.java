class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long require = m*k;

        if(require>bloomDay.length) return -1;

        int maxDay = Integer.MIN_VALUE;
        int minDay = Integer.MAX_VALUE;

        for(int bloom : bloomDay){
            minDay = Math.min(minDay,bloom);
            maxDay = Math.max(maxDay,bloom);
        }

        int low = minDay;
        int high = maxDay;
        int result =-1;

        while(low<=high){
            int mid = (low + high)/2;
            if(isPossible(bloomDay,mid,m,k)){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }

    public boolean isPossible(int []bloomDay, int day, int m, int k){
        int count = 0;
        int bouquet =0;
        for(int bloom : bloomDay){
            if(bloom<=day){
                count++;
                if(count == k){
                    bouquet++;
                    count =0;
                }
            }
            else{
                count =0;
            }
        }
        return bouquet>=m;
    }
}