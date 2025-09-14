
import java.util.Random;

public class HeightOfPlayers {

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();

        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150;
        }

        System.out.print("Heights of players: ");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();

        System.out.println("Shortest height: " + shortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + tallestHeight(heights) + " cm");
        System.out.printf("Mean height: %.2f cm\n", meanHeight(heights));
    }
}
