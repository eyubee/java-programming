package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        Map<Integer, String>  map = new HashMap<>();
        map.put(1,"james");
        map.put(2,"bound");
        map.put(2,"bob");
        map.put(3,"eyu");
        map.put(6,"blabla");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("bob"));

    }
}
