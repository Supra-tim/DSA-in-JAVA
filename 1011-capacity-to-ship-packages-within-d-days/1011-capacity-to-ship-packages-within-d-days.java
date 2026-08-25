class Solution {
    public int day(int a[], int cap){
        int day=1, load=0;
        for(int i=0; i<a.length; i++){
            if(load+a[i]>cap){
                day=day+1;
                load=a[i];
            }
            else{
                load=load+a[i];
            }
        }
        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int num:weights){
            low=Math.max(low, num);
            high=high+num;
        }
        while(low<=high){
        int mid=(low+high)/2;
        int n_day=day(weights,mid);
        if(n_day<=days){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return low;
    }
}
