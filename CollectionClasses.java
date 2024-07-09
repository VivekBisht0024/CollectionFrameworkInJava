import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionClasses {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(10000);
        list.add(100);
        list.add(4000);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(500);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list, 100));
        
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list , Comparator.reverseOrder());
        System.out.println(list);

    }
}