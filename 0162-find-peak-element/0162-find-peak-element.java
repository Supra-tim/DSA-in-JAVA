class Solution {
    public int findPeakElement(int[] nums) {
        int str=1;
        int end=nums.length-1;
        int mid;
        if(nums.length==1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        while(str<=end){
            mid=(str+end)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid]<nums[mid-1]){
                end=mid-1;
            }
            else if(nums[mid]<nums[mid+1]){
                str=mid+1;
            }
        }
        return -1;
    }
}