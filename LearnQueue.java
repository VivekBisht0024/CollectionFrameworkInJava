import java.util.LinkedList;
import java.util.Queue;


public class LearnQueue {
    public static void main(String[] args) {
        // first in first out
        Queue<Integer> queue = new LinkedList<>();

        // to add the elements
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);

        System.out.println(queue);
        // to remove
        queue.poll();
        System.out.println(queue);

        //peek() - which is the next element to get pop

        System.out.println(queue.peek());

    }
}
