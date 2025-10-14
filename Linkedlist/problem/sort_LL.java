import java.util.Arrays;
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
    public static Node sortedList(Node head){
    Node temp=head;
    int count=0;
    int arr[];
    while(temp!=null){
        count++;
        temp=temp.next;
    }
    temp=head;
    int i=0;
    arr=new int[count];
    while(temp!=null && i<count){
    arr[i++]=temp.data;
    temp=temp.next;
    }
    Arrays.sort(arr);
    Node curr=new Node(arr[0]);
    Node head2=curr;
    for(int j=1; j<count; j++){
        head2.next=new Node(arr[j]);
        head2=head2.next;
    }
    return curr;
    }
}
public class sort_LL{
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
        System.out.print("Enter the number of element want to store in Array:");
        int n=sc.nextInt();
        Node head;
        System.out.print("enter the first number of element:");
        int num=sc.nextInt();
        head=new Node(num);
        Node temp=head;
        for(int i=1; i<n; i++){
            System.out.print("Enter the "+(i+1)+" no element:");
            int val=sc.nextInt();
            temp.next=new Node(val);
            temp=temp.next;
        }
        print(head);
        Solution sl=new Solution();
        head=sl.sortedList(head);
        print(head);
    }
}