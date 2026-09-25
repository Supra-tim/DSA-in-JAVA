class Solution {
    public int findMaxLength(int[] nums) {
        // int maxlen=0;
        // for(int start=0; start<nums.length; start++){
        //     int zero=0, one=0;
        //     for(int end=start; end<nums.length; end++){
        //         if(nums[end]==0){
        //             zero++;
        //         }
        //         else{
        //             one++;
        //         }
        //         if(zero==one){
        //             maxlen=Math.max(maxlen, end-start+1);
        //         }
        //     }
        // }
        // return maxlen;
        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxlen=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                sum+=-1;
            }
            else{
                sum+=1;
            }
            if(map.containsKey(sum)){
                maxlen=Math.max(maxlen, i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }
}