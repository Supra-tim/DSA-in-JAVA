import java.util.*;
class Solution{
    ArrayList<Integer>find(int a[], int k){
        int n=a.length;
        int str=0;
        int end=n-1;
        int mid;
        int indx1=0;
        int indx2=0;
        ArrayList<Integer>result=new ArrayList<>();
        while(str<=end){
            mid=(str+(end-str)/2);
            if(a[mid]==k){
                indx1=mid;
                while(a[mid]!=k){
                    indx1=mid;
                    mid--;
                }
                while(a[mid]!=k){
                    indx2=mid;
                    mid++;
                }
                result.add(indx1);
                result.add(indx2);
            }
            else if(a[mid]>k){
                end=mid-1;
            }
            else{
                str=mid+1;
            }
        }
        return result;
    }
}
public class fst_lst_occ{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entetr the number of elements want to store in an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        Solution s=new Solution();
        System.out.print("Enter the number want to search in array:");
        int k=sc.nextInt();
        ArrayList<Integer>indices=s.find(arr,k);
        System.out.print("First and last Indices are:"+ indices);
    }
}