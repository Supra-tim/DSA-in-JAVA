import java.util.Scanner;
class s{
    int top=-1;
    int arr[];
    int size;
    s(int size){
        this.size=size;
        arr=new int[size];
    }
    public void push(int x){
        if(top==size-1){
            System.out.println("Overflow");
        }
        else{
            top++;
        arr[top]=x;
        System.out.println("Element pushed");
        }
    }
    public void pop(){
    if(top==-1){
        System.out.println("uNDERFLOW");
    }
    else{
        top--;
        System.out.println("eLEMENT DELETED");
    }
    }
    public void display(){
    if(top==-1){
        System.out.println("Stack is empty");
    }
    else{
        for(int i=top; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    }
}
public class stack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n=sc.nextInt();
        s s1=new s(n);
        System.out.print("Enter the total no of choice:");
        int ns=sc.nextInt();
        outerloop: while(ns!=5){
            System.out.print("enter the choice[1 to 3]:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.print("enter a number to add in the stack:");
                int num=sc.nextInt();
                s1.push(num);
                break;
                case 2:
                s1.pop();
                break;
                case 3:
                s1.display();
                break;
                case 4:
                System.out.print("Exit");
                break outerloop;
            }
        }
    }
}
