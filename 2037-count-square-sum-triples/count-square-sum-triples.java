class Solution {
    public int countTriples(int n) {
        int a,b,c;
        int count=0;
        for(a=1;a<=n;a++)
        {
            for(b=1;b<=n;b++)
            {
                c=n;
                while(c!=0)
                {
                    if(c>a&&c>b)
                    {
                        int sum = a*a + b*b;
                        int zc=(int)Math.pow(c,2);
                        if(zc==sum)
                        {
                            count++;
                        }
                    }
                    c--;
                }
            }
        }
        return count;
    }
}