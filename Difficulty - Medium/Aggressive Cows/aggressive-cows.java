class Solution {
    public boolean place(int a[], int mid, int k){
        int cow=1;
        int dist=a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]-dist>=mid){
                cow++;
                dist=a[i];
            }
        }
        if(cow>=k){
            return true;
        }
        else{
            return false;
        }
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low=0;
        int high=arr[arr.length-1]-arr[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(place(arr,mid, k)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
}
