import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        // size increases and decreases automatically

        // ArrayList<String> studentsName = new ArrayList<>();
        // studentsName.add("Vivek");

        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList();
        list2.add(5);
        list2.add(6);

        list.addAll(list2);
        System.out.println(list);

        // to get the element

        System.out.println(list.get(1));

        list.remove(3);
        System.out.println(list);

        // to remove an element

        list.remove(Integer.valueOf(2));
        System.out.println(list);

        // to remove all elements in the list

        // list.clear();
        // System.out.println(list);

        list.set(1, 40);
        System.out.println(list);

        System.out.println(list.contains(40));

        // iterating througout the list

        // for(int i = 0 ; i > list.size() ; i++){
        // System.out.println(list.get(i));
        // }

        for (Integer element : list) {
            System.out.println(element);
        }

        // iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("Iterator" + it.next());
        }

    }
}