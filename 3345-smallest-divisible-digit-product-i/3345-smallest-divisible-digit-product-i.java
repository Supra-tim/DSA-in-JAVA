class Solution {
    public int multiply(int a){
        int rem;
        int num=a;
        int mul=1;
        while(num!=0){
            rem=num%10;
            num=num/10;
            mul=mul*rem;
        }
        return mul;
    }
    public int smallestNumber(int n, int t) {
        while(true){
        int res=multiply(n);
        if(res%t==0){
            return n;
        }
        n++;
      }
    }
}