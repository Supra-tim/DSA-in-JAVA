import java.util.Scanner;
public class Binary{
    public static int search(int a[], int size, int val){
    int mid;
    int start=0;
    int end=size-1;
    while(start<=end){
        mid=(start+end)/2;
        if(a[mid]==val){
            return mid;
        }
        else if(a[mid]>val){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element want to store in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no elements:");
            arr[i]=sc.nextInt();
        }
            for(int i=0; i<n; i++){
                System.out.print(arr[i]);
            }
            System.out.print("Enter the number want to search:");
            int num=sc.nextInt();
            int result=search(arr,n,num);
            if(result==-1){
                System.out.print(" the value "+ num+ " is no present:");
            }
            else{
                System.out.print("The value "+ num+" is present at index "+ result);
            }
    }
}