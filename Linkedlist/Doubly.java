import java.util.Scanner;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.prev=null;
        this.next=null;
    }
}
public class Doubly{
    public static Node insertatfront(Node head, int num){
    Node temp=head;
    Node q= new Node(num);
    q.next=head;
    if(head!=null){
        head.prev=q;
    }
    return q;
    }
    public static Node insertatanypos(Node head,int num, int pos){
        Node q=new Node(num);
    if(pos<1){
        System.out.println("Invalid position");
        return head;
    }
    if(pos==1){
        head=insertatfront(head, num);
        return head;
    }
    Node temp=head;

    for(int i=1; i<pos-1 && temp!=null; i++){
    temp=temp.next;
    }
    temp.next=q;
    q.prev=temp;
    temp.next=q;
    if(temp.next!=null){
        temp.next.prev=q;
    }
    return head;
    }
    public static Node insertatend(Node head, int num){
        Node temp=head;
    Node q=new Node(num);
    if(temp==null){
        return q;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=q;
    q.prev=temp;
    return head;
    }
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
        System.out.print("Enter the total no want to store in Linked List:");
        int n=sc.nextInt();
        System.out.print("Enter the first no:");
        int n1=sc.nextInt();
        Node head= new Node(n1);
        Node temp=head;
        for(int i=1; i<n; i++){
            System.out.print("Enter the "+(i+1)+ " no element:");
            int val=sc.nextInt();
            Node b=new Node(val);
            temp.next=b;
            b.prev=temp;
            temp=b;
        }
        outerloop: while(true){
        System.out.print("Enter the choice no[between 1 to 3]");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.print("Enter a number:");
            int v1=sc.nextInt();
            head=insertatfront(head,v1);
            print(head);
            break;

            case 2:
            System.out.print("Enter a number:");
            int v2=sc.nextInt();
            head=insertatend(head, v2);
            print(head);
            break;

            case 3:
            System.out.print("Enter a number:");
            int v3=sc.nextInt();
            System.out.print("Enter the position where we want to store the number:");
            int pos=sc.nextInt();
            head=insertatanypos(head, v3, pos);
            print(head);
            break;
            
            case 4:
            System.out.print("Exit");
            break outerloop;
        }
        }
    }
}