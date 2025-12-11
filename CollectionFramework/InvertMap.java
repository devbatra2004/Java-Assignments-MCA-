//Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.

import java.util.*;

public class InvertMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        System.out.println("Input Map: " + map);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            inverted.putIfAbsent(value, new ArrayList<>());
            inverted.get(value).add(key);
        }

        System.out.println("Inverted Map: " + inverted);
    }
}
