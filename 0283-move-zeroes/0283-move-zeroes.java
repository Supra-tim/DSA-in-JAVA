class Solution {
    public void moveZeroes(int[] nums) {
       int s=nums.length;
       int pos=0;
       for(int i=0; i<s; i++){
        if(nums[i]!=0){
            nums[pos]=nums[i];
            pos++;
        }
       }
       while(pos<s){
        nums[pos]=0;
        pos++;
       }
       for(int i=0; i<s; i++){
        System.out.print(nums[i] +" ");
       }
    }
}