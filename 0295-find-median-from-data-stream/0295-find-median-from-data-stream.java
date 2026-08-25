class MedianFinder {
    PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer>min=new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(pq.isEmpty()|| num<pq.peek()){
            pq.add(num);
        }
        else{
            min.add(num);
        }

        if(Math.abs(pq.size()-min.size())>1){
            min.add(pq.poll());
        }
        else if(pq.size()<min.size()){
            pq.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(pq.size()==min.size()){
            return (pq.peek()+min.peek())/2.0;
        }
        else{
            return pq.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
