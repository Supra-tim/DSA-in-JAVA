import java.util.Collections;
import java.util.PriorityQueue;
public class Implementation{
public static void main(String[] args) {
    PriorityQueue<Integer>pq=new PriorityQueue<>();// MIn heap because Default pq in java is Min heap
    pq.offer(1);
    pq.offer(2);
    pq.offer(10);
    pq.offer(0);
    System.out.println("Smallest element using min heap:"+ pq.peek());

    PriorityQueue<Integer>maxpq=new PriorityQueue<>(Collections.reverseOrder()); // Max HEap 
    maxpq.offer(1);
    maxpq.offer(2);
    maxpq.offer(10);
    maxpq.offer(0);
    System.out.print("largest element using max heap:"+ maxpq.peek());
}
}