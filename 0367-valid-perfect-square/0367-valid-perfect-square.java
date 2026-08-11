class Solution {
    public boolean isPerfectSquare(int num) {
        long str=1;
        long end=num;
        while(str<=end){
            long mid=(str+end)/2;
            if((mid*mid)==num){
                return true;
            }
            else if((mid*mid)<=num){
                str=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return false;
    }
}