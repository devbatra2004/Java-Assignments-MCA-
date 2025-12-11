
public class CensorWords {

    public static void main(String[] args) {
        String text = "This is a new world";
        String[] badWords = {"hii", "earth"};
        for (String word : badWords) {
            text = text.replaceAll("(?i)" + word, "****");
        }
        System.out.println(text);
    }
}
