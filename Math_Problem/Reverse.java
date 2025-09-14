import java.util.Scanner;
class Rev{
    public int revnum(int x){
    int val=x;
    int rem;
    int re=0;
    while(val!=0){
        rem=val%10;
        val=val/10;
        if(re>Integer.MAX_VALUE/10 || re<Integer.MIN_VALUE/10){
            return 0;
        }
        re=(re*10)+rem;
    }
    return re;
    }
}
public class Reverse{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int num=sc.nextInt();
    Rev r=new Rev();
    System.out.print(Integer.MAX_VALUE);
    System.out.print(Integer.MIN_VALUE);
    int result=r.revnum(num);
    System.out.print("Reverse no of "+ num +" is:" + result);
}
}
