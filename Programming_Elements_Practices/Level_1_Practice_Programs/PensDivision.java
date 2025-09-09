
import java.util.*;

public class PensDivision {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the number of pens: ");
        int pens = s1.nextInt();

        int students = 3;
        int divided_pens = pens / students;
        int remaining_pens = pens % students;

        System.out.println("Each student will get: " + divided_pens + " pens");
        System.out.println("Remaining pens: " + remaining_pens);
    }
}
