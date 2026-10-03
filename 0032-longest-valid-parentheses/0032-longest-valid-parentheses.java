class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int open=0;
        int close=0;
        //Left to Right
        int res=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                res=Math.max(res, open+close);
            }
            else if(close>open){
                open=close=0;
            }
        }
        // Right to Left
        open=0;
        close=0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                res=Math.max(res, open+close);
            }
            else if(open>close){
                open=close=0;
            }
        }
        return res;
    }
}