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
    public Node rotateRight(Node head, int k){
        int length=1; 
        Node temp=head;
    while(temp.next!=null){
        length++;
        temp=temp.next;
    }
    if(k%length==0){
        return head;
    }
    temp.next=head;
    k=k%length;
    int newhead=length-k;
    Node temp2=head;
    for(int i=1; i<newhead; i++){
        temp2=temp2.next;
    }
    Node newHead=temp2.next;
    temp2.next=null;
    return newHead;
    }
}
    public class rotete{
        public static void print(Node head){
            Node temp=head;
            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.print("Null");
            System.out.println();
        }
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number od elements want to store in a list:");
            int n=sc.nextInt();
            System.out.print("Enter the first number :");
            int num=sc.nextInt();
            Node head =new Node(num);
            Node temp=head;
            for(int i=1; i<n; i++){
                System.out.print("Enter the "+(i+1)+" no element:" );
                int val=sc.nextInt();
                temp.next=new Node(val);
                temp=temp.next;
            }
            print(head);
            System.out.print("Enter the number wich time wanrt to rotate the list:");
            int k=sc.nextInt();
            Solution sl=new Solution();
            head=sl.rotateRight(head, k);
            print(head);
        }
    }
