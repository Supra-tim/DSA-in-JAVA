class Solution {
    public void dfs(int node, boolean vis[], int adj[][]){
        vis[node]=true;
        for(int i=0; i<adj.length; i++){
            if(adj[node][i]==1 && vis[i]==false){
                dfs(i, vis, adj);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean vis[]=new boolean[n];
        int cnt=0;
        for(int i=0; i<n; i++){
            if(vis[i]==false){
                cnt++;
                dfs(i, vis, isConnected);
            }
        }
        return cnt;
    }
}