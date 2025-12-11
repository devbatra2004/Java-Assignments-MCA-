
import java.util.*;

public class SpringSeason {

    static boolean isSpring(int month, int day) {
        if ((month == 3 && day >= 20)
                || (month == 4)
                || (month == 5)
                || (month == 6 && day <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = s1.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = s1.nextInt();

        if (isSpring(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        s1.close();
    }
}
