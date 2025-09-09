import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
public class Singly{
    public static Node insertatfirst(Node head, int num){
    Node r=new Node(num);
    r.next=head;
    return r;
    }
    public static Node insertatend(Node head, int num){
    Node temp=head;
    Node r=new Node(num);
    if(temp==null){
        return r;
    }
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=r;
    return head;
    }
    public static Node insertatanypoint(Node head, int num, int pos){
        Node temp=head;
    if(pos<1){
        return head;
    }
    if(pos==1){
        head=insertatfirst(head, num);
        return head;
    }
    for(int i=1; i<pos-1 && temp!=null; i++){
    temp=temp.next;
    }
    if(temp==null){
        return head;
    }
    Node a=new Node(num);
    temp.next=a.next;
    temp.next=a;
    return head;
    }
    public static void print(Node head){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
    System.out.print("Null");
    System.err.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want to add in Linked List:");
        int n=sc.nextInt();
        System.out.print("Enter the first element in the linked list:");
        int val=sc.nextInt();
        Node head=new Node(val);
        Node temp= head;
        for(int i=1; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            int num=sc.nextInt();
            temp.next=new Node(num);
            temp=temp.next;
        }
        print(head);
        outerloop:while(true){
            System.out.print("Enter a number [between 1 to 3] for choosing insertion:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.print("Enter the no:");
                int n1=sc.nextInt();
                head=insertatfirst(head,n1);
                print(head);
                break;
                case 2:
                System.out.print("Enter a np:");
                int n2=sc.nextInt();
                head=insertatend(head,n2);
                print(head);
                break;

                case 3:
                System.out.print("Enter a number:");
                int n3=sc.nextInt();
                System.out.print("eNTER the position where we want to add element:");
                int pos=sc.nextInt();
                head=insertatanypoint(head,n3,pos);
                print(head);

                case 4:
                System.out.print("Exit");
                break outerloop;

            }
        }
    }
}