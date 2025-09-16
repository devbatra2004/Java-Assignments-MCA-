
public class ReverseString {

    public static void main(String[] args) {

        String name = "dev";

        System.out.print("the reverse of string is : - ");
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));

        }
    }
}
