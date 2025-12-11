//Problem Statement:A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.

public class SelectionSort {

    public static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {85, 40, 95, 70, 60};

        selectionSort(scores);

        System.out.println("Sorted Exam Scores:");
        for (int s : scores) {
            System.out.print(s + " ");
        }
    }
}
