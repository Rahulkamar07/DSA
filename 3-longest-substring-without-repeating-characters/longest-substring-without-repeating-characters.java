class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen =0;
        if(s.length()<=1 && !s.equals(""))
        {
            maxlen = 1;
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                String st = ""+s.charAt(i);
                for(int j=i+1;j<s.length();j++)
                {
                    int n = st.length();
                    if(!st.contains(String.valueOf(s.charAt(j))))
                    {
                        st = st + s.charAt(j);
                        n = st.length();
                        maxlen = Math.max(maxlen,n);
                    }
                    else
                    {
                        maxlen = Math.max(maxlen,n);
                        break;
                    }
                }
            }
        }
        return maxlen;
    }
}