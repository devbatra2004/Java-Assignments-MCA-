//Reverse the elements of a queue using only queue operations (e.g., add, remove, isEmpty).

import java.util.*;

public class ReverseQueue {

    public static void reverse(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }

        int x = q.remove();
        reverse(q);
        q.add(x);
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("Original Queue:" + q);
        reverse(q);
        System.out.println("Reversed Queue:" + q);
    }
}
