import java.util.ArrayList;
import java.util.Scanner;
class Implement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*1----2
        .      .
        .      .
        3-----4*/

        //adjacent matrix

        System.out.print("enter the no of vertices:");
        int n=sc.nextInt();
        System.out.print("enter the no of edges:");
        int m=sc.nextInt();
        int adj[][]=new int[n+1][n+1];
        for(int i=0; i<m; i++){
            System.out.println("Bridge");
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;  // only for non directed graph
        }
        
        System.out.println("Adjacency Matrix:");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        
        //List
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        
        for(int i=0; i<m; i++){
            System.out.println("Bridge");
            int u=sc.nextInt();
            int v=sc.nextInt();
            list.get(u).add(v); // 1->2
            list.get(v).add(u);  // only for non directed graph
        }
        System.out.println("List:");
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}