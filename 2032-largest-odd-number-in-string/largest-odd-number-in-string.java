class Solution {
    public String largestOddNumber(String num) {
        int max = -1;
        for(int i=num.length()-1;i>=0;i--){
            char ch = num.charAt(i);
            int n = ch - '0';
            if(n%2==1){
                max = i;
                break;
            }
        }
        if(max==-1) return "";
        int i=0;
        while(i<=max && num.charAt(i)=='0'){
            i++;
        }
        return num.substring(i,max+1);
    }
}