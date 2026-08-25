import java.util.Scanner;
public class Find_Element{
    public static void check(int a[], int num){
    for(int i=0; i<a.length; i++){
        if(a[i]==num){
            System.out.print(" index of the targated value is:" + i);
        }
    }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+ " no element:");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.print("ENter a target:");
        int val=sc.nextInt();
        check(arr,val);
    }
}