class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count=0;
        int temp=0;
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                count++;
                temp++;
            }
            else if(temp!=0 && ch==' ')
            {
                break;
            }
            else
            {
                //do nothing
            }
        }
        return count;
    }
}