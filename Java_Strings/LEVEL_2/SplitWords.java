
import java.util.Scanner;

public class SplitWords {

    static String[] splitWords(String text) {
        text = text.trim() + " ";
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        String[] words = new String[spaces];
        int index = 0, start = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] manual = splitWords(text);
        String[] builtin = text.split(" ");

        System.out.println("Manual split:");
        for (String w : manual) {
            System.out.println(w);
        }

        System.out.println("Built-in split:");
        for (String w : builtin) {
            System.out.println(w);
        }

        System.out.println("Are both same? " + compareArrays(manual, builtin));
        sc.close();
    }
}
