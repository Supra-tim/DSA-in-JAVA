class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return find(nums,goal)-find(nums, goal-1);
    }
        public int find(int nums[], int goal){
        int l=0, r=0, sum=0, cnt=0;
        if(goal<0){
            return 0;
        }
        while(r<nums.length){
            sum=sum+nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}