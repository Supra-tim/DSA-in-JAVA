class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        // int cnt;
        // if(n==0){
        //     return 0;
        // }
        
        // towerOfHanoi(n-1, from, aux, to);
        // cnt++;
        // towerOfHanoi(n-1, aux, to, from);
        // cnt++;
        double ans= Math.pow(2,n)-1;
        return (int)ans;
    }
}
