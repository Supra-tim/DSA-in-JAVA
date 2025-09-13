import java.util.Scanner;
class Check{
    public int value(int arr[], int val){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=val){
                arr[count]=arr[i];
                count++;
            }
        }
        System.out.println("Array after element reoved:");
        for(int i=count; i<arr.length; i++){
            arr[i]=0;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return count;
    }
}
public class removeelement{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number want to remove from the array:");
        int val=sc.nextInt();
        Check c=new Check();
        int result=c.value(arr,val);
        System.out.println();
        System.out.print("the size of new array:" +result);
    }
}