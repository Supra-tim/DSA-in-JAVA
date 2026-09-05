class Solution {
    public int res(int n){
        if(n<=1){
            return n;
        }
        return res(n-1)+res(n-2);
    }
    public int fib(int n) {
        return res(n);
    }
}