class Solution {
    public int place(int a[], long k){
        int stu=1;
        long pages=0;
        for(int i=0; i<a.length; i++){
            if(pages+a[i]<=k){
                pages=pages+a[i];
            }
            else{
                stu++;
                pages=a[i];
            }
        }
        return stu;
    }
    public int findPages(int[] arr, int k) {
        // code here
        long low=Integer.MIN_VALUE;
        long high=0;
        for(int i=0; i<arr.length; i++){
            low=Math.max(low,arr[i]);
            high=high+arr[i];
        }
        if(k>arr.length){
            return -1;
        }
        while(low<=high){
            long mid=(low+high)/2;
            int no_stu=place(arr, mid);
            if(no_stu>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)low;
    }
}
