import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
class Rev{
    public Node list(Node head){
    Node temp=head;
    Node prev=null;
    Node front;
    while(temp!=null){
        front=temp.next;
        temp.next=prev;
        prev=temp;
        temp=front;
    }
    return prev;
    }
}
public class ReverseLinkedList{
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no of elements want to store in the list:");
        int n=sc.nextInt();
        System.out.print("Enter the first no :");
        int val=sc.nextInt();
        Node head=new Node(val);
        Node temp=head;
        for(int i=0; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            int num=sc.nextInt();
            temp.next=new Node(num);
            temp=temp.next;
        }
        print(head);
        Rev r=new Rev();
        head=r.list(head);
            print(head);
    }
}