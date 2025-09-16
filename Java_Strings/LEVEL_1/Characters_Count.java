// compress a string by showing characters count

public class Characters_Count {

    public static void main(String[] args) {
        String a = "aaabbcccdd";
        int count = 1;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                count = count + 1;
            }

        }
        System.out.println("every string count is : " + count);
    }
}
