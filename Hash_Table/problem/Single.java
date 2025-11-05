import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
class Hash{
Set<Integer>set=new HashSet<>();
public boolean contains(int x){
    if(!set.contains(x)){
        return false;
    }
    return true;
}
public int add(int a[]){
    int sum=0;
    int result=0;
for(int i:a){
if(!set.contains(i)){
    set.add(i);
    sum=sum+i;
}
result=result+i;
}
return 2*sum-result;
}
}
public class Single{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the"+(i+1)+" no element:");
            arr[i]=sc.nextInt();
        }
        int res;
        Hash hs=new Hash();
        res=hs.add(arr);
        System.out.print("the single element is:"+res);
    }
}