
import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt(), y = sc.nextInt();
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int f = d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        int day = f % 7;
        System.out.println(day);
        sc.close();
    }
}
