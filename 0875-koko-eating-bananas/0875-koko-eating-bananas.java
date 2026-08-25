class Solution {
    public int max(int a[]){
        int max=a[0];
        for(int i=0; i<a.length; i++){
            if(max<a[i]){
                max=Math.max(max,a[i]);
            }
        }
        return max;
    }
    public long hour(int b[], int x){
        long hours=0;
        for(int i=0; i<b.length; i++){
            hours=hours+(b[i]+x-1)/x;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            long max_hr=hour(piles, mid);
            if(max_hr<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}