// to change the form of the data is called hashing

import java.util.HashMap;

public class LearnHashing {
    public static void main(String[] args) {

        // using HashMap - stores Key Value pairs

        // Insert - O(1)
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);

        // Get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        // ContainsKey - O(1)

        System.out.println(hm.containsKey("China"));
        System.out.println(hm.containsKey("Indonesia"));

        // Remove - O(1)

        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // Empty

        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm);
    }
}
