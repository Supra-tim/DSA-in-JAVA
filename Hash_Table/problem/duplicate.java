import java.util.ArrayList;
import java.util.Scanner;
class Hash{
    ArrayList<Integer>set=new ArrayList<>();
public  boolean contains(int x){
if(!set.contains(x)){
    insert(x);
    return false;
}
else{
    return true;
}
}
public void insert(int y){
set.add(y);
}
public void display(){
    for(int i=0; i<set.size();i++){
    System.out.print(set.get(i));
    }
}
}
public class duplicate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            arr[i]=sc.nextInt();
        }
        Hash hs=new Hash();
        for(int i:arr){
            hs.contains(i);
        }
        hs.display();

    }
}
