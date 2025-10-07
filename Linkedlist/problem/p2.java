import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

class Stack {
    int top = -1;
    int arr[];
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int x) {
        if (top == size - 1) {
            System.out.print("Overflow");
        }
        // if(top==-1){
        // top++;
        // arr[top]=x;
        // System.out.println("Element pushed ");
        // }
        top++;
        arr[top] = x;
        System.out.println("Element pushed ");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }
}

class palindrome {
    public static boolean check(Node head, int n) {
        Node temp = head;
        Stack s = new Stack(n);
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != s.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}

public class p2 {
    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements want to store in List:");
        int n = sc.nextInt();
        System.out.print("Enter the first no:");
        int num = sc.nextInt();
        Node head = new Node(num);
        Node temp = head;
        for (int i = 1; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " no element:");
            int val = sc.nextInt();
            temp.next = new Node(val);
            temp = temp.next;
        }
        print(head);
        if (palindrome.check(head, n)) {
            System.out.println("Palindrome Linked List");
        } else {
            System.out.println("Not a palindrome Linked List");
        }
    }
}