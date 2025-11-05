import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Hash{
    Set<Integer>set=new HashSet<>();
    Set<Integer>ans=new HashSet<>();
    public int[] add(int a[], int b[]){
        for(int i:a){
            if(!set.contains(i)){
                set.add(i);
            }
        }
        for(int j:b){
            if(set.contains(j)){
                ans.add(j);
            }
        }
        int res[]=new int[ans.size()];
        int k=0;
        for(int j:ans){
            res[k]=j;
            k++;
        }
        return res;
    }
    public Boolean contains(int x){
        if(set.contains(x)){
            return true;
        }
        else{
            return false;
        }

    }
}
public class Intersection{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array:");
        int n1=sc.nextInt();
        int arr[]=new int[n1];
        for(int i=0; i<n1; i++){
            System.out.print("ENTER THE "+(i+1)+" no element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the size of first array:");
        int n2=sc.nextInt();
        int brr[]=new int[n2];
        for(int i=0; i<n2; i++){
            System.out.print("ENTER THE "+(i+1)+" no element:");
            brr[i]=sc.nextInt();
        }
        Hash hs=new Hash();
        int result[]=hs.add(arr,brr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
        }

    }
}