import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashing{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer>map=new HashMap<>();
        //insert
        System.out.print("Enter the number of element we want to save as collection:");
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Enter the key(String):");
            String key= sc.next();
            System.out.print("Enter the value(Integer):");
            int value=sc.nextInt();
            map.put(key,value);
        }
        for(Map.Entry<String, Integer>e: map.entrySet()){
            System.out.println(map);
            // System.out.println(e.getKey());
            // System.out.println(e.getValue());
        }
    }
} 