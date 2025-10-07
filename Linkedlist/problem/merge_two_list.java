import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class merge_two_list {
    public static Node implement() {
        System.out.print("Enter the number of element want to store in the list:");
        int n = sc.nextInt();
        System.out.print("Enter the first no:");
        int val = sc.nextInt();
        Node head = new Node(val);
        Node temp = head;
        for (int i = 1; i < n; i++) {
            System.out.print("NEtre the " + (i + 1) + " no element:");
            int num = sc.nextInt();
            temp.next = new Node(num);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of total linked list want to implement:");
        int no=sc.nextInt();
        Node head;
        while(no!=0){
            head=
        }
    }
}