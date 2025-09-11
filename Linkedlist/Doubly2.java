import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
        this.prev=null;
    }
}
public class Doubly2 {
    public static Node deletefromfront(Node head){
    Node temp=head;
    if(head==null){
        return head;
    }
    head=head.next;
    if(head.next!=null){
        head.prev=null;
    }
    return head;
    }
    public static Node deletefromend(Node head){
    Node temp=head;
    if(head==null){
        return null;
    }
    if(head.next==null){
        return null;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
    if(temp.prev!=null){
    temp.prev.next=null;
    }
    return head;
    }
    public static Node deletefromanypos(Node head, int pos){
        Node temp=head;
    if(pos<1){
        System.out.print("Invalid position");
        return head;
    }
    if(pos==1){
        head=deletefromfront(head);
        return head;
    }
    for(int i=1; i<pos-1 && temp!=null; i++){
    temp=temp.next;
    }
    if(temp==null){
        return head;
    }
    if(temp.prev!=null){
        temp.prev.next=temp.next;
    }
    if(head==temp){
        head=temp.next;
        temp=null;
    }
    return null;
    }
    public static void print(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data +" ->");
        temp=temp.next;
    }
    System.out.print("Null");
    System.out.println( );
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no of element want to store in linked list:");
        int n=sc.nextInt();
        System.out.print("Enter the first no:");
        int val=sc.nextInt();
        Node head=new Node(val);
        Node temp=head;
        for(int i=1; i<n; i++){
            System.out.print("Enter the "+(i+1)+ " no element:");
            int num=sc.nextInt();
            Node a=new Node(num);
            temp.next=a;
            a.prev=temp;
            temp=a;
        }
        System.out.print("Enter the number of choice[between 1 to 4]:");
        int choice=sc.nextInt();
        outerloop: while(true){
                switch(choice){
                case 1:
                head=deletefromfront(head);
                print(head);
                break;
    
                case 2:
                head=deletefromend(head);
                print(head);
                break;
    
                case 3:
                System.out.print("Enter any position for deletation:");
                int pos=sc.nextInt();
                head=deletefromanypos(head,pos);
                print(head);
                break;

                case 4:
                System.out.print("Exit");
                break outerloop;
            }
        }

    }
}
