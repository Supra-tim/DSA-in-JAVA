class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums1.length; i++){
            min=Math.min(min, nums1[i]);
        }
        if(min%2==1){
            return true;
        }
        else{
            for(int num:nums1){
                if(num%2==1){
                    return false;
                }
            }
        }
        return true;
    }
}