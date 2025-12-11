
import java.util.Scanner;

public class VowelConsonantType {

    static String checkType(char ch) {
        if (!Character.isLetter(ch)) {
            return "Not a Letter";
        }
        ch = Character.toLowerCase(ch);
        if ("aeiou".indexOf(ch) != -1) {
            return "Vowel";
        }
        return "Consonant";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println(ch + "\t" + checkType(ch));
        }
        sc.close();
    }
}
