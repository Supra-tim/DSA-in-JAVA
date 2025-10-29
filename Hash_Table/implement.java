import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Hash{
    private int bucketCount;
    private List<List<Integer>>Table;
    public Hash(int num) {
        this.bucketCount=num;
        Table=new ArrayList<>();
        for(int i=0; i<num; i++){
            Table.add(new ArrayList<>());
        }
    }
    
    public void insert(int key){
        int index=getHashIndex(key);
        Table.get(index).add(key);
    }
    public void remove(int key){
        int index=getHashIndex(key);
        Table.get(index).remove(Integer.valueOf(key));
    }
    public void display(){
        for(int i=0; i<bucketCount; i++){
            System.out.print(i);
            for(int j: Table.get(i)){
                System.out.print("-->"+j);
            }
            System.out.println();
        }
    }
    private int getHashIndex(int key){
        return key%bucketCount;

    }
}
public class implement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want to atore in array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a mod element:");
        int num=sc.nextInt();
        Hash hs=new Hash(num);
        for(int i:arr){
            hs.insert(i);
        }
        hs.display();
        System.out.print("Enter a no want to delete from the table:");
        int y=sc.nextInt();
        hs.remove(y);
        hs.display();

    }
}