//Problem Statement:A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.

public class BubbleSort {

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {50, 30, 90, 10, 70};
        bubbleSort(marks);
        System.out.println("Sorted Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
