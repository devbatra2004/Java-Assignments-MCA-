
import java.util.Scanner;

public class VotingEligibility {

    static void canVote(int[] ages) {
        for (int age : ages) {
            if (age >= 18) {
                System.out.println(age + " -> Can Vote");
            } else {
                System.out.println(age + " -> Cannot Vote");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter ages:");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }
        canVote(ages);

        sc.close();
    }
}
