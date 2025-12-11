//Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.

import java.util.*;

class CircularBuffer {

    private int[] buffer;
    private int size;
    private int start = 0;
    private int end = 0;
    private int count = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int x) {
        buffer[end] = x;
        end = (end + 1) % size;

        if (count < size) {
            count++;
        } else {
            start = (start + 1) % size;
        }
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            result.add(buffer[(start + i) % size]);
        }
        return result;
    }
}

public class CircularBufferDemo {

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println(cb.getBuffer());
        cb.insert(4);
        System.out.println(cb.getBuffer());
        cb.insert(5);
        System.out.println(cb.getBuffer());
    }
}
