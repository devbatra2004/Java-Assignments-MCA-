
import java.util.Scanner;

public class TrimSpaces {

    static String trimSpaces(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        String manual = trimSpaces(text);
        String builtin = text.trim();

        System.out.println("Manual trim: '" + manual + "'");
        System.out.println("Built-in trim: '" + builtin + "'");
        System.out.println("Same? " + manual.equals(builtin));
        sc.close();
    }
}
