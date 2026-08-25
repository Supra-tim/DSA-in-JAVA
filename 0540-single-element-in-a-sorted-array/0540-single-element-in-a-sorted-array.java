class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<>();
        int unq=-1;
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==1){
                unq=num;
            }
        }
        return unq;
    }
}