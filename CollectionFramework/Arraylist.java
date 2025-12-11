
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int itr : list) {
            System.out.println(itr);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.get(2));
        System.out.println(list.contains(3));
        System.out.println(list.size());

        System.out.println(list.remove(3));

        System.out.println(list.set(2, 10));

    }
}
