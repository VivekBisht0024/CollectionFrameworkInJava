import java.util.HashMap;

public class LearnHashMap {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        map.put("Vivek",1);
        map.put("Aman",1);
        map.put("Anuj",1);
        map.put("Mark",1);
        map.put("Miu",1);
        map.put("Vivek",100);

        if(!map.containsKey("two")){
            map.put("two",22);
        }

        System.out.println(map);

        // Iterate throughout the map

        for(String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.containsValue(1));
        System.out.println(map.isEmpty());

    }
}
