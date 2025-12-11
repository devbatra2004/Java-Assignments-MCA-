//Read a text file and count the frequency of each word using a HashMap. Ignore case and punctuation.

import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine();

        Map<String, Integer> freq = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", "");
        String[] words = text.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency" + freq);
        sc.close();
    }
}
