
// Queue using LinkedList - First In First Out - front - pop() , rear - push();
import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {
    public static void main(String[] args) {

        Queue<Integer> Q = new LinkedList<>();
        // Offer is like add function
        Q.offer(1);

        Q.offer(2);

        Q.offer(3);

        Q.offer(4);

        Q.offer(5);

        System.out.println(Q);

        // peek() is same like element()

        System.out.println("The element is ready to get out is "+Q.peek());

        // poll() is same like remove()

        Q.poll();

        System.out.println(Q);

        


    }
}
