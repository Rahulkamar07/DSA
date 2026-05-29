class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int []f = new int[n];
        f[0]=0;
        if(n>1){
        f[1]=1;
            for(int i=2;i<n;i++){
                f[i] = f[i-1] + f[i-2];
            }
        }
        int res =0;
        if(n>1){
            res = f[n-1] + f[n-2];
        }
        else{
            res = 1;
        }
        return res;
    }
}