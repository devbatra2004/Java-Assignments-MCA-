
import java.util.Scanner;

public class LowerCaseCompare {

    static String convertToLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String builtInLower = text.toLowerCase();
        String manualLower = convertToLower(text);
        boolean areEqual = compareStrings(builtInLower, manualLower);
        System.out.println("Original text: " + text);
        System.out.println("Lowercase using built-in method: " + builtInLower);
        System.out.println("Lowercase using manual method: " + manualLower);
        System.out.println("Are both results equal? " + areEqual);

        sc.close();
    }
}
