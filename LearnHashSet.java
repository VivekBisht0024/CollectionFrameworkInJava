// Set doesn't allows you to add duplicate elements

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        // LinkedHashSet - LinkedList + HashSet

        // Set<Integer> lhs = new LinkedHashSet<>();

        // Set<Integer> set = new TreeSet<>(); - elements are unique and are in sorted form like in BST

        //operation in HashSet - o(1);
        // Operation in TreeSet - O(lognN)
        Set<Integer> s = new HashSet<>();

        s.add(19);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        System.out.println(s);
        s.remove(19);

        System.out.println(s);


        System.out.println(s.contains(2));

        System.out.println(s.isEmpty());

        System.out.println(s.size());

        s.clear();

        System.out.println(s);

    }
}
