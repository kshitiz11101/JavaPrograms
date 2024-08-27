import java.util.HashMap;
import java.util.Map;

public class MapBasics {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Navin", 56);
        map.put("Kiran",63);
        map.put("Sushil", 19);
        map.put("Harsh", 46);
        System.out.println(map);

        System.out.println(map.get("Kiran"));
        map.put("Harsh",99);
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        for(String key: map.keySet()){
            System.out.println(key+ ":" +map.get(key));

        }
        System.out.println(map.getClass());  // class java.util.HashMap
//   HashTable and HashMap are somewhat similar, if you want to use Synchronization ,use HashTable ,else use HashMap.
    }
}
