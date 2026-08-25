class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int larg=1;
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i]+1==nums[i+1]){
                count=count+1;
                larg=Math.max(count, larg);
            }
            else{
                count=1;
            }
        }
        return larg;
    }
}