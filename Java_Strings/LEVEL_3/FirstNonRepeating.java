
import java.util.Scanner;

public class FirstNonRepeating {

    static char firstNonRepeat(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return c;
            }
        }
        return '-';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        char ans = firstNonRepeat(s);
        if (ans == '-') {
            System.out.println("No non-repeating char");
        } else {
            System.out.println("First non-repeating: " + ans);
        }
        sc.close();
    }
}
