
import java.util.*;

public class findFrequency {

    public static void main(String[] args) {

        String arr[] = {"apple", "banana", "apple", "orange"};

        Map<String, Integer> map = new HashMap<>();

        for (String word : arr) {
            int oldCount = map.getOrDefault(word, 0);
            map.put(word, oldCount + 1);
        }

        System.out.println(map);

    }
}
