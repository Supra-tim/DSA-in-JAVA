class Solution {
    public int arrangeCoins(int n) {
        int low=1;
        int high=n;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long cal=(long)mid*(mid+1)/2;
            if(cal>n){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }
}