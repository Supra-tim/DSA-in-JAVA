class Solution {
    public long countCommas(long n) {
        long result=0;
        long lower=1000;
        long comas=1;
        while(lower<=n){
            long  uper=lower*1000-1;
            if(uper>n){
                uper=n;
            }
            long cnt=uper-lower+1;
            result+=cnt*comas;
            lower*=1000;
            comas++;
        }
        return result;
    }
}