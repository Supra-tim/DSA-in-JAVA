class Solution {
    public int LowerBound(int arr[], int x){
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    int minRow(int mat[][]) {
        // code here
        int cnt_max=Integer.MAX_VALUE;
        int index=-1;
        for(int i=0; i<mat.length; i++){
            int cnt_one=mat[i].length-LowerBound(mat[i], 1);
                if(cnt_one<cnt_max){
                    cnt_max=cnt_one;
                    index=i+1;
            }
        }
        return index;
    }
};
