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
    public static Node Duplicate(Node head){
    Node temp=head;
    Node curr=temp;
    if(temp==null){
        return head;
    }
    while(temp.next!=null){
        if(temp.data!=temp.next.data){
            temp=temp.next;
        }
        else{
            temp.next=temp.next.next;
        }
    }
    return curr;
    }
}
public class remove_dup{
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
        System.out.print("Enter the number of element want to add in list:");
        int n=sc.nextInt();
        System.out.print("Enter the first elemnt:");
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
        head=sl.Duplicate(head);
        print(head);
    }
}