import java.util.Scanner;
class result{
    public boolean ans(int arr[]){
        // int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
public class dup{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter the size:");
        // int n=sc.nextInt();
        int arr[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        result rs=new result();
        boolean output=rs.ans(arr);
        System.out.print(output);
    }
}