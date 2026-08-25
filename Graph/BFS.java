import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
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
    public ArrayList<Integer> BFS(int start){
        ArrayList<Integer>bfs=new ArrayList<>();
        boolean vis[]=new boolean[V];
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        vis[start]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);
            for(Integer neighbour: list.get(node)){
                if(vis[neighbour]==false){
                    vis[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return bfs;
    }
}
class BFS{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no of vertices:");
        int n=sc.nextInt();
        System.out.print("enter the no of edges:");
        int m=sc.nextInt();

        Graph graph=new Graph(n);
        for(int i=0; i<=m; i++){
            System.out.println("Bridge");
            int u=sc.nextInt();
            int v=sc.nextInt();
            graph.addEdge(u, v);
        }
        System.out.print("Enter the starting node :");
        int start=sc.nextInt();
        ArrayList<Integer>res=graph.BFS(start);
        System.out.print("BFS:" + res);
    }
}