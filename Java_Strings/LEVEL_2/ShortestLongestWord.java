
import java.util.Scanner;

public class ShortestLongestWord {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String shortest = words[0], longest = words[0];
        for (String w : words) {
            if (w.length() < shortest.length()) {
                shortest = w;
            }
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
        sc.close();
    }
}
