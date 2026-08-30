class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=0;
        int indx1=0, indx2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max=Math.max(nums[i], max);
                indx1=i+1;
            }
            if(nums[i]<min){
                min=Math.min(nums[i], min);
                indx2=i+1;
            }
        }
          int left=Math.max(indx1, indx2);
          int right=nums.length-Math.min(indx1, indx2)+1;
          ans=Math.min(indx1, indx2)+(nums.length-Math.max(indx1, indx2)+1);
        return Math.min(left, Math.min(right, ans));
    }
}