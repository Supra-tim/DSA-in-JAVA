import java.util.Scanner;
import java.util.Stack;

class check {
    public boolean bool(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')' && top!='(') ||
                    (ch=='}' && top!='{') ||
                        (ch==']' && top!='[')){
                            return false;
                        }
            }
        }
        return stack.isEmpty();
    }
}

public class parenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression:");
        String s = sc.nextLine();
        check c = new check();
        boolean e = c.bool(s);
        if(e==true){
            System.out.print("Balances parenthesis");
        }
        else{
            System.out.print("Unbalances parenthesis");
        }
    }
}
