class Solution {
    public void solve(int n, int open, int close, String curr, ArrayList<String>res){
        if(curr.length()==2*n){
            res.add(curr);
            return;
        }
        if(open<n){
            solve(n, open+1, close, curr+"(", res);
        }
        if(close<open){
            solve(n, open, close+1, curr+")", res);
        }
    }
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String>ans=new ArrayList<>();
        solve(n/2,0, 0,"", ans);
        return ans;
    }
}