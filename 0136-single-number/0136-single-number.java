class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> Map=new HashMap<>();
        for(int num:nums){
            Map.put(num, Map.getOrDefault(num,0)+1);
        }
        for(int num:nums){
            if(Map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}