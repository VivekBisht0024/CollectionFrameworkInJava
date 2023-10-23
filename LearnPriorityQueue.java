import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        
        // MinHeap construction by Default
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(46);

        System.out.println(pq);

        // minimum integer will get poll/removed
        System.out.println(pq.poll());

        //peek() - the next element to get poll
        System.out.println(pq.peek());


    }
}
