class Solution {
    public int findMin(int[] nums) {
        int str=0;
        int end=nums.length-1;
        int mid;
        int ans=Integer.MAX_VALUE;
        while(str<=end){
            mid=(str+end)/2;
            if(nums[str]<=nums[mid]){
                ans=Math.min(ans, nums[str]);
                str=mid+1;
            }
            else{
                ans=Math.min(ans, nums[mid]);
                end=mid-1;
            }
        }
        return ans;
    }
}