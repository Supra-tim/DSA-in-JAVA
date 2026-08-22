class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int mul=1;
        while(num!=0){
            int rem=num%10;
             num=num/10;
             sum=sum+rem;
             mul=mul*rem;
        }
        if(n%(sum+mul)==0){
            return true;
        }
        else{
            return false;
        }
    }
}