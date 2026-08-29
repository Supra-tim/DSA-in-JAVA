import java.util.Scanner;
class Prefix_sum{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the " + i+1 + "no element:");
            arr[i]=sc.nextInt();
        }
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1; i<n; i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            System.out.print(prefix[i]+" ");
        }
    }
}