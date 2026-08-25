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
    public int[] rowAndMaximumOnes(int[][] mat) {
        int c_max=0;
        int indx=0;
        for(int i=0; i<mat.length; i++){
            int c_one=mat[i].length-LowerBound(mat[i], 1);
            if(c_one>c_max){
                c_max=c_one;
                indx=i;
            }
        }
        int res[]=new int[2];
        res[0]=indx;
        res[1]=c_max;
        return res;
    }
}
