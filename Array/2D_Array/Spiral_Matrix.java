import java.util.ArrayList;
import java.util.Scanner;
class Sp{
    public ArrayList<Integer> Spaceholder(int[][]mat){
    int row=mat.length;
    int col=mat[0].length;
    int srow=0;
    int scol=0;
    int erow=row-1;
    int ecol=col-1;
    ArrayList<Integer>result=new ArrayList<>();
    while(srow<=erow && scol<=ecol){
        //top
        for(int j=scol; j<=ecol; j++){
        result.add(mat[srow][j]);
        }
        //right
        for(int i=srow+1; i<=erow; i++){
            result.add(mat[i][ecol]);
        }
        //bottom
        if(srow<erow){
            for(int j=ecol-1; j>=scol; j--){
                result.add(mat[erow][j]);
            }

        }
        //left
        if(scol<ecol){
            for(int i=erow-1; i>=srow+1; i--){
                result.add(mat[i][scol]);
            }

        }
        srow++; erow--; scol++; ecol--;
    }
    return result;
    }
}
public class Spiral_Matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  number of rows:");
        int row=sc.nextInt();
        System.out.print("eNTRER THE no of columns:");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter the " + i + " " + j + " no element:");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Sp s=new Sp();
        ArrayList<Integer>result=s.Spaceholder(arr);
        System.out.print("Spiral Matrix is: " + result);
    }
}