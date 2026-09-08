class Solution {
    public boolean isSafe(int row, int col, char[][]board, int n){
        int c=col;
        while(c>=0){
            if(board[row][c]=='Q'){
                return false;
            }
            c--;
        }
        int r=row-1;
        c=col-1;
        while(r>=0 && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        r=row+1;
        c=col-1;
        while(r<n && c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            r++;
            c--;
        }
        return true;
    }
    public void solve(int col, char[][]board, List<List<String>>ans, int n){
        if(col==n){
            List<String>temp=new ArrayList<>();
            for(int i=0; i<n; i++){
               temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int row=0; row<n; row++){
            if(isSafe(row,col, board, n)){
                board[row][col]='Q';
                solve(col+1, board, ans, n);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char [][]board=new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i], '.');
        }
        solve(0, board, ans, n);
        return ans;
    }
}