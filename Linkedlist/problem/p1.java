import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

class Remove {
    int size;

    // Remove(int size) {
    //     this.size = size;
    // }

    public Node deletefromfront(Node head) {
        Node temp = head;
        head=head.next;
        return head;
    }

    // public Node deletefromend(Node head) {
    //     Node temp = head;
    //     while (temp.next.next != null) {
    //         temp = temp.next;
    //     }
    //     temp.next = null;
    //     return head;
    // }

    public Node deletefromanypos(Node head, int pos) {
        Node temp = head;
        // if (pos == 1) {
        //     head = deletefromfront(head);
        //     return head;
        // }
        Node prev = null;
        for (int i = 1; i < pos && temp != null; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }

    public Node delete(Node head, int pos) {
        if (pos == 1) {
            head = deletefromfront(head);
            return head;
        }
        // if (pos == size) {
        //     head = deletefromend(head);
        //     return head;
        // }
        head = deletefromanypos(head, pos);
        return head;
    }

    public Node rlist(Node head, int num) {
        Node temp = head;
        int pos = 1;
        while (temp != null) {
            // /pos++;
            if (temp.data == num) {
                // System.out.print(pos);
                head = delete(head, pos);
                pos--;
            }
            pos++;
            temp=temp.next;
        }
        return head;
    }
}

public class p1 {
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
        System.out.print("Enter the no of element want to store in list:");
        int n = sc.nextInt();
        System.out.print("Enter the first element:");
        int val = sc.nextInt();
        Node head = new Node(val);
        Node temp = head;
        for (int i = 1; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " no element:");
            int num = sc.nextInt();
            temp.next = new Node(num);
            temp = temp.next;
        }
        print(head);
        Remove r = new Remove();
        System.out.print("Enter the number want to delete from tha list:");
        int v = sc.nextInt();
        head = r.rlist(head, v);
        print(head);
    }
}