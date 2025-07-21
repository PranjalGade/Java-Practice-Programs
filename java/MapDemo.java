import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Riya",80);
        map.put("Tejas",50);
        map.put("Sai",60);

        System.out.println(map.get("Sai"));

        //print all key value pair
        for(Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //To check key value present or not
        System.out.println(map.containsKey("Riya"));
        System.out.println(map.containsValue(50));

    }
}
