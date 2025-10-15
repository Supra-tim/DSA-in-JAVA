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
    public static Node Dup(Node head){
        Node dummy=new Node(0);
        dummy.next=head;
        Node temp=head;
        Node curr=dummy;
        while(temp!=null){
            if(temp.next!=null && temp.data==temp.next.data){
                while(temp.next!=null && temp.data==temp.next.data){
                    temp=temp.next;
                }
                curr.next=temp.next;
            }
            else{
                curr=curr.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
public class Dup_LL_2{
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements want to store in a list:");
        int n=sc.nextInt();
        System.out.print("eNTER THE FIRST NO element:");
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
        head=sl.Dup(head);
        print(head);
    }
}