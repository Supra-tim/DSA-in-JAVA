import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
public class singly2{
    public static Node deletefromfront(Node head){
    Node temp=head;
    if(head==null){
        return null;
    }
    if(temp.next==null){
        head=null;
        return head;
    }
    head=head.next;
    return head;
    }
    public static Node deletefromend(Node head){
    Node temp=head;
    if(head==null){
        return null;
    }
    if(head.next==null){
        head=null;
        return head;
    }
    while(temp.next.next!=null){
        temp=temp.next;
    }
    temp.next=null;
    return head;
    }
    public static Node deletefromanypos(Node head, int pos){
        Node temp=head;
    if(pos<1){
        return head;
    }
    if(pos==1){
        head=deletefromfront(head);
        return head;
    }
    Node prev=null;
    for(int i=1; i<pos && temp!=null; i++){
        prev=temp;
        temp=temp.next;
    }
    prev.next=temp.next;
    return head;
    }
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println( );

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of element want to store in Linked List:");
        int n=sc.nextInt();
        System.out.print("Enter the first no:");
        int num=sc.nextInt();
        Node head=new Node(num);
        Node temp=head;
        for(int i=1; i<n; i++){
            System.out.print("enter the "+(i+1)+" no element:");
            int val=sc.nextInt();
            temp.next=new Node(val);
            temp=temp.next;
        }
        print(head);
        outerloop:while(true){
            System.out.print("Enter a choice [between 1 to 3]:");
            int choice=sc.nextInt();
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
                System.out.print("Enter the position where we want to add the number:");
                int pos=sc.nextInt();
                head=deletefromanypos(head,pos);
                print(head);

                case 4:
                System.out.print("Exit");
                break outerloop;
            }
        }
    }
}