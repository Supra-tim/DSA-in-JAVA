
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int new_data){
        this.data=new_data;
        this.next=null;
    }
}
public class Add_List {
public static Node reverse(int num){
Node head=null;
Node temp=null;
while(num!=0){
    int rem=num%10;
    Node s=new Node(rem);
    if(head==null){
        head=s;
        temp=head;
    }
    else{
        temp.next=s;
        temp=temp.next;
    }
    num=num/10;
}
return head;
}
public static Node add(Node l1, Node l2){
Node dummy=new Node(0);
Node p=l1, q=l2;
int sum,x,y;
int carry=0;
Node temp=dummy;
while(p!=null || q!=null){
    if(p!=null){
        x=p.data;
        p=p.next;
    }
    else{
        x=0;
    }
    if(q!=null){
        y=q.data;
        q=q.next;
    }
    else{
        y=0;
    }
    sum=x+y+carry;
    temp.next=new Node(sum%10);
    temp=temp.next;
    carry=sum/10;
}
if(carry>0){
    temp.next=new Node(carry);
}
return dummy.next;
}
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n1=sc.nextInt();
        System.out.print("Enter another no:");
        int n2=sc.nextInt();
        Node head1=reverse(n1);
        Node head2=reverse(n2);
        print(head1);
        print(head2);
        Node sum=add(head1, head2);
        print(sum);
    }
}
