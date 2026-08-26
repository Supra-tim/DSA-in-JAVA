import java.util.ArrayList;
import java.util.Scanner;
class Graph{
    int V;
    ArrayList<ArrayList<Integer>>list;
    Graph(int V){
        this.V=V;
        list=new ArrayList<>();
        for(int i=0; i<V; i++){
            list.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    public void dfs(int node, boolean vis[], ArrayList<Integer>res){
        vis[node]=true;
        res.add(node);
        for(Integer it: list.get(node)){
            if(vis[it]==false){
                dfs(it, vis, res);
            }
        }
    }
    public ArrayList<Integer>DFS(int start){
        ArrayList<Integer>result=new ArrayList<>();
        boolean vis[]=new boolean[V];
        dfs(start, vis, result);
        return result;
    }
}
public class DFS{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of vertices:");
        int n=sc.nextInt();
        System.out.print("enter the no of edges:");
        int m=sc.nextInt();
        Graph graph=new Graph(n);
        for(int i=0; i<m; i++){
            System.out.println("Bridge");
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.addEdge(u, v);
        }
        System.out.print("Enter the starting node :");
        int start=sc.nextInt();
        ArrayList<Integer>res=graph.DFS(start);
        System.out.print("DFS:" + res);
    }
}