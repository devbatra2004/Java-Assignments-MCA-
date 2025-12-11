
import java.util.*;

public class ReverseList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(5);
        System.out.println("elements of array list in simple order ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("elements of array list in reversed order ");
        for (int i = list.size() - 1; i > 0; i--) {
            System.out.println(list.get(i));
        }
        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        list2.add(5);

        System.out.println("elements of link list in reversed order ");
        for (int i = list2.size() - 1; i > 0; i--) {
            System.out.println(list2.get(i));
        }

    }
}
