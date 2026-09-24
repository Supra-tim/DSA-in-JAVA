class Solution {
    public int cal(int num){
        int add=0;
        while(num!=0){
            int rem=num%10;
            add=add+rem;
            num=num/10;
        }
        return add;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int sum=cal(nums[i]);
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}