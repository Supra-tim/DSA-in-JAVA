class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0, cnt=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            int remove=sum-k;
            cnt+=map.getOrDefault(remove, 0);
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}