class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int nums:stones){
            pq.add(nums);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x=pq.poll();
            if(x==y){
                continue;
            }
            else{
                pq.add(y-x);
            }
        }
        if(pq.size()==1){
            return pq.peek();
        }
        return 0;
    }
}