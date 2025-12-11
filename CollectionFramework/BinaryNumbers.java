//Generate the first N binary numbers (as strings) using a queue.

import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int n = sc.nextInt();

        Queue<String> q = new LinkedList<>();
        q.add("1");

        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = q.remove();
            result.add(s);

            q.add(s + "0");
            q.add(s + "1");
        }

        System.out.println(result);
        sc.close();
    }

}
