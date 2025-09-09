import java.util.Scanner;
public class duplicate{
    public static int check(int a[]){
    int i=0, j=1;
    int m=a.length;
    while(j<m){
        if(a[i]!=a[j]){
            i++;
            a[i]=a[j];
        }
        j++;
    }
    for(int k=0; k<a.length; k++){
        System.out.print(a[k]+" ");
    }
    return i+1;
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
        System.out.print("Enter thr "+(i+1)+" No element:");
        arr[i]=sc.nextInt();
    }
    int size=check(arr);
    System.out.println(size);
    }
}