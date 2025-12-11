
class Count_Word {

    public static void main(String[] args) {
        String str = "HI MY NAME IS DEV";
        int n = str.length();
        int spaces = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                spaces = spaces + 1;
            }
        }

        System.out.print("Number of words are ");
        System.out.print(spaces + 1);
    }
}
