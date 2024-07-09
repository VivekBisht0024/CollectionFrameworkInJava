//Double Ended Queue

import java.util.ArrayDeque;

public class LearnArrayDeque {
    
    public static void main(String[] args) {

        ArrayDeque<Integer> adq =  new ArrayDeque<>();
        adq.offer(23);
        adq.offer(45);
        adq.offer(34);
        adq.offer(24);
        adq.offer(50);

        //adds the element at the starting position
        adq.offerFirst(100);

        //offerLast
        adq.offerLast(1000);

        System.out.println(adq);

        adq.poll();
        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
        

    }
}
