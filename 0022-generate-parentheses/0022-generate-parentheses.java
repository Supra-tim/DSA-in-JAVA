class Solution {
    public void solve(int n, int open, int close, String curr, List<String>res){
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
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        solve(n, 0,0, "", ans);
        return ans;
    }
}