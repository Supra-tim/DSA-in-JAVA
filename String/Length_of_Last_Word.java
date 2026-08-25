import java.util.*;
public class Length_of_Last_Word{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        String ch=sc.nextLine();
        int n=ch.length();
        int count=0;
        int i=n-1;
        while(i>0 && ch.charAt(i)!=' '){
        count++;
        i--;
        }
        System.out.print("total size is:"+count);
    }
}