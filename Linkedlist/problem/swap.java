import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int new_data){
    this.data=new_data;
    this.next=null;
    }
}
class Solution{
    public Node SwNode(Node head){
    Node Dummy=new Node(0);
    Dummy.next=head;
    Node point=Dummy;
    while(point.next!=null && point.next.next!=null){
        Node l1=point.next;
        Node l2=point.next.next;

        l1.next=l2.next;
        l2.next=l1;

        point.next=l2;
        point=l1;
    }
    return Dummy.next;
    }
}
public class swap{
    public static void print(Node head){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want to add in a list:");
        int n=sc.nextInt();
        System.out.print("Enter the first no:");
        int num=sc.nextInt();
        Node head=new Node(num);
        Node temp=head;
        for(int i=1; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            int val=sc.nextInt();
            temp.next=new Node(val);
            temp=temp.next;
        }
        print(head);
        Solution sl=new Solution();
        head=sl.SwNode(head);
        print(head);
    }
}