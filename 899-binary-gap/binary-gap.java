class Solution {
    public int binaryGap(int n) {
        String bin = Integer.toBinaryString(n);
        int m= bin.length();
        int dist =0;
        int j=0;
        int count=0;
        for(int i=0;i<m;i++)
        {
            char ch = bin.charAt(i);
            if(ch=='1')
            {
                if(j==0 && count==0)
                {
                    j=i;
                    count++;
                }
                else
                {
                    int ndist = i-j;
                    j=i;
                    dist = Math.max(dist,ndist);
                }
            }
        }
        return dist;
    }
}