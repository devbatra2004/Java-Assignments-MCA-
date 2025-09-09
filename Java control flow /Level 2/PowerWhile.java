
import java.util.Scanner;

public class PowerWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();
        int result = 1;
        int i = 1;
        while (i <= pow) {
            result *= num;
            i++;
        }
        System.out.println(result);

    }
}
