
import java.util.Scanner;

public class DuplicateWords {

    static void findDuplicates(String s) {
        String[] words = s.split(" ");
        boolean[] visited = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println(words[i] + " -> " + count);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        findDuplicates(s);
        sc.close();
    }
}
