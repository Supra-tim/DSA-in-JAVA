// Set contains only unique no of elements means no element is repeated here

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Hash {

    private List<List<Integer>> Table;
    private List<Integer>bucket;
    private int bucketCount;

    public Hash(int num) {
        this.bucketCount = num;
        Table = new ArrayList<>();
        for (int i = 0; i < bucketCount; i++) {
            Table.add(new ArrayList<>());
        }
    }
private List<Integer>getBucket(int x){
    int Index=getHashIndex(x);
    bucket=Table.get(Index);
    return bucket;
}
    public void add(int x) {
        List<Integer>bucket=getBucket(x);
        bucket.add(x);
    }

    public void remove(int x) {
        List<Integer>bucket=getBucket(x);
        if (bucket.contains(x)) {
            bucket.remove(Integer.valueOf(x));
        } else {
            System.out.print("Element is not present in the set");
        }
    }

    
    public Boolean contains(int x) {
        List<Integer>bucket=getBucket(x);
        if (!bucket.contains(x)) {
            add(x);
            return false;
        } else {
            return true;
        }
    }
    
    public void display() {
        for (int i = 0; i < bucketCount; i++) {
            System.out.print(i);
            for (int j : Table.get(i)) {
                System.out.print("->" + j);
            }
            System.out.println();
        }
    }
    public int getHashIndex(int key) {
        return key % bucketCount;
    }
}

public class implement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " no element:");
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the mod number of element:");
        int val = sc.nextInt();
        Hash hs = new Hash(val);
        outerloop:
        while (true) {
            System.out.print("Enter a choice: [between 1 to 3]");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i : arr) {
                        hs.contains(i);
                    }
                    break;
                case 2:
                    System.out.print("enter a number:");
                    int num = sc.nextInt();
                    hs.remove(num);
                    break;
                case 3:
                    hs.display();
                    break;
                case 4:
                    System.out.print("Exit");
                    break outerloop;
            }

        }

    }
}
