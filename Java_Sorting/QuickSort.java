//Problem Statement:An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.

public class QuickSort {

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(a, low, high);
            quickSort(a, low, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {500, 150, 300, 100, 450};

        quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}
