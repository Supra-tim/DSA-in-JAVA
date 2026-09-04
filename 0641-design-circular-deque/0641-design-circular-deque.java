class MyCircularDeque {
    int deque[];
    int k;
    int front;
    int rear;
    int cnt;
    public MyCircularDeque(int k) {
        this.k=k;
        deque=new int[k];
        front=0;
        rear=-1;
        cnt=0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front=rear=0;
        }
        else{
            front=(front-1+k)%k;
        }
            deque[front]=value;
            cnt++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front=rear=0;
        }
        else{
            rear=(rear+1)%k;
        }
            deque[rear]=value;
            cnt++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        if(cnt==1){
            front=0;
            rear=-1;
        }
        else{
            front=(front+1)%k;
        }
            cnt--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        if(cnt==1){
            front=0;
            rear=-1;
        }
        else{
            rear=(rear-1+k)%k;
        }
            cnt--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return deque[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return deque[rear];
    }
    
    public boolean isEmpty() {
        if(cnt==0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(cnt==k){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */