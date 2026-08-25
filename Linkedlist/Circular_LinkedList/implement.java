import java.util.*;
class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
public class implement{
    public static void print(Node head){
        Node temp=head;
        while(temp.next!=null){
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want to store in List:");
        int n=sc.nextInt();
        System.out.print("Enter the first no of elemnt:");
        int num=sc.nextInt();
        Node head=new Node(num);
        Node temp=head;
        for(int i=1; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            int val=sc.nextInt();
            temp.next=new Node(val);
            temp=temp.next;
        }
        temp.next=head;
        print(head);
    }
}