class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        char arr[]=new char[n];
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c=='('){
                st.push(i);
            }
            else if(c==')'){
                if(st.isEmpty()){
                    arr[i]='!';
                }
                else{
                    st.pop();
                }
            }

        }
        while(!st.isEmpty()){
            arr[st.pop()]='!';
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
            if(arr[i]!='!')
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}