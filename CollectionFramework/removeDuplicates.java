
import java.util.*;

public class removeDuplicates {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> unique = new ArrayList<>();

        for (int num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }
        }

        System.out.println(unique);
    }
}
