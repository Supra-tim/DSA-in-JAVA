class Solution {
    public boolean possible(int arr[], int mid, int threshold){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+(arr[i]+mid-1)/mid;
        }
        if(sum<=threshold){
            return true;
        }
        return false;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int num:nums){
            high=Math.max(high, num);
        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(nums, mid, threshold)==true){
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
