class Solution {
    public int splits(int a[], int m){
        int sub=1;
        int str=0;
        for(int i=0; i<a.length; i++){
            if(str+a[i]<=m){
                str=str+a[i];
            }
            else{
                sub++;
                str=a[i];
            }
        }
        return sub;
    }
    public int splitArray(int[] arr, int k) {
        // code here
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0; i<arr.length; i++){
            low=Math.max(low, arr[i]);
            high=high+arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int split=splits(arr, mid);
            if(split>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
};
