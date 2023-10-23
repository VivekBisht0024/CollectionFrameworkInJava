import java.util.ArrayDeque;

// Stack and Queue can be implemented by this ArrayDeque

public class LearnArrayDeque {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offer(24);
        adq.offer(36);
        adq.offer(48);
        //adds the element at the first place
        adq.offerFirst(400);
        //adds the element at the last place
        adq.offerLast(1000);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.pollFirst());
    }
}
