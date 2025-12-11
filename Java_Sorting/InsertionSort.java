//Problem Statement:A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.

public class InsertionSort {

    public static void insertionSort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] empIDs = {105, 102, 120, 101, 110};

        insertionSort(empIDs);

        System.out.println("Sorted Employee IDs:");
        for (int id : empIDs) {
            System.out.print(id + " ");
        }
    }
}
