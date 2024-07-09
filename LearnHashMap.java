// HashMap - stores key value pairs
// keys will be unique

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    public static void main(String[] args) {
        
        HashMap<String,Integer> mp = new HashMap<>();
        mp.put("Scorpio",1);
        mp.put("Thar",2);
        mp.put("Defender",3);
        mp.put("XUV",4);

        System.out.println(mp);

        if(!mp.containsKey("Scorpio")){
            mp.put("Scorpio1", 23);
        }

        System.out.println(mp);

        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key : mp.keySet()){
            System.out.println(key);
        }

        for(Integer val : mp.values() ){
            System.out.println(val);
        }
        System.out.println(mp.containsValue(2));
        System.out.println(mp.isEmpty());
    
    }
}
