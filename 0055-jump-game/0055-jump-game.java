class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx=0;
        int ans=0;
        
        for(int i=0; i<nums.length; i++){
            if(i>maxIdx){
                return false;
            }
            else{
                ans=i+nums[i];
                maxIdx=Math.max(maxIdx,ans);
            }
        }
        return true;
    }
}
