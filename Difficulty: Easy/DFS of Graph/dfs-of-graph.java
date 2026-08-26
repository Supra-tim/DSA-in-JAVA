class Solution {
    public void DFS(int node, ArrayList<Integer>list,ArrayList<ArrayList<Integer>> adj, boolean vis[]){
        vis[node]=true;
        list.add(node);
        for(Integer it: adj.get(node)){
            if(vis[it]==false){
                DFS(it,list, adj, vis);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        ArrayList<Integer>list=new ArrayList<>();
        boolean vis[]=new boolean[n];
        DFS(0, list, adj, vis);
        return list;
    }
}