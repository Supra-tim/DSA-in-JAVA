class Solution {
    public boolean search(int[] nums, int target) {
        int str=0;
        int end=nums.length-1;
        int mid;
        while(str<=end){
            mid=(str+end)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[str]==nums[mid] && nums[mid]==nums[end]){
                str++;
                end--;
                continue;
            }
            //left sorted
            if(nums[str]<=nums[mid]){
                if(nums[str]<=target && target<=nums[mid]){
                    end=mid-1;
                }
                else{
                    str=mid+1;
                }
            }
            //right sorted
            else{
                if(nums[mid]<=target && target<=nums[end]){
                    str=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return false;
    }
}