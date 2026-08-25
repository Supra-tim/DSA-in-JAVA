class Solution {
    public boolean search(int arr[], int target){
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>=target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0; i<n; i++){
            if(search(mat[i], x)==true){
                return true;
            }
        }
        return false;
    }
}
