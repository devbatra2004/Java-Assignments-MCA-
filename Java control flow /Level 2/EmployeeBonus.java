
import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        int years = sc.nextInt();
        double bonus = (years > 5) ? salary * 0.05 : 0;
        System.out.println(bonus);
        sc.close();
    }
}
