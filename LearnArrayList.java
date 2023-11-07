import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        // Java collection framework
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4,900);
        System.out.println(list);
        // to get element - O(1)
        int element = list.get(2);
        System.out.println(element);

        //Delete - O(N)
        list.remove(1);
        System.out.println(list);

        // set element at index 

        list.set(1,100);
        System.out.println(list);

        //contains

        System.out.println(list.contains(100));

        //size 

        System.out.println(list.size());

        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i) + " ");
        }
        System.out.println();
    }
}
