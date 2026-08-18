class Solution {
    public boolean possible(int arr[], int day, int m, int k){
        int cnt=0, nbk=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=day){
                cnt++;
            }
            else{
                nbk=nbk+(cnt/k);
                cnt=0;
            }
        }
            nbk=nbk+(cnt/k);
            if(nbk>=m){
                return true;
            }
            else{
                return false;
            }
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int ans=0;
        for(int num:bloomDay){
            low=Math.min(low,num);
            high=Math.max(high,num);
        }
        if(bloomDay.length<(long)m*k){
            return -1;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay, mid, m,k)==true){
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