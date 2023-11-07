import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(300);
        list.add(400);
        list.add(200);
        list.add(500);
        list.add(700);
        list.add(10000);

        // Ascending order
        Collections.sort(list);
        System.out.println(list);

        // Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        //Comparators - fnx logic
        

    }
}
