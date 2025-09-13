import java.util.Scanner;
class a{
    public int sum(int a[]){
    int i=0,j=1,k=2;
    int m=a.length;
    while(k<m){
        if(a[i]+a[j]+a[k]==0){

        }
    }
    }
    public void print(){
        
    }
}
public class ThreeSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            arr[i]=sc.nextInt();
        }
        a a1=new a1();
        int res=a1.sum(arr);
    }
}