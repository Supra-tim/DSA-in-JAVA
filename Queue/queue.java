import java.util.Scanner;

class q {
    int front = -1;
    int rear = -1;
    int arr[];
    int n;

    q(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void enqueue(int x) {
        if (rear == (n - 1)) {
            System.err.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front++;
            rear++;
            arr[rear] = x;
            System.out.println("element added");
        } else {
            rear++;
            arr[rear] = x;
            System.out.println("Elementr added");
        }
    }

    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            front = rear = -1;
            System.out.println("Element deleted and Queue is empty");
        } else {
            front++;
            System.out.println("Element deleted");
        }
    }

    public void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <=rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the size of the queue:");
        int n = sc.nextInt();
        q q1 = new q(n);
        outerloop: while (true) {
            System.out.print("Enter the choice no [between 1 to 4]:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number to add in queue:");
                    int num = sc.nextInt();
                    q1.enqueue(num);
                    break;
                case 2:
                    q1.dequeue();
                    break;
                case 3:
                    q1.display();
                    break;
                case 4:
                    System.out.print("Exit");
                    break outerloop;
            }
        }
    }
}
