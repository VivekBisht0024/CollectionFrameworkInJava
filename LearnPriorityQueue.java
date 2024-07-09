import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        // Min heap gets implements by default here
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(3);
        pq.offer(4);
        pq.offer(5);

        System.out.println(pq);

        pq.poll();

        System.out.println(pq);

        System.out.println(pq.size());
        System.out.println(pq.peek());
        
    }
}
