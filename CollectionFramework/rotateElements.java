
import java.util.*;

public class rotateElements {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int k = 3;

        for (int i = 0; i < k; i++) {
            int first = list.remove(0);
            list.add(first);
        }

        System.out.println(list);
    }
}
