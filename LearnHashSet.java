import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //HashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);
        System.out.println(set);

        set.remove(100);
        System.out.println(set);

       
        System.out.println(set.contains(500));
        System.out.println(set.size());
        set.clear();
        System.out.println(set);

        // Set<Integer> set = new TreeSet<>(); - elements are in Sorted Order
        
    }
}
