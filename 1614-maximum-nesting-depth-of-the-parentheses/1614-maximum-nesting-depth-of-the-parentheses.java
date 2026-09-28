class Solution {
    public int maxDepth(String s) {
        int res=0;
        int curr=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(c=='('){
                res=Math.max(res, ++curr);
            }
            if(c==')'){
                curr--;
            }
        }
        return res;
    }
}