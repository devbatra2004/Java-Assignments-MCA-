// <!-- NAME-DEV  ROLL_NO-2510987011 -->

import java.util.*;

public class Compare_Strings {

    static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st string: ");
        String a = sc.next();

        System.out.print("Enter 2nd string: ");
        String b = sc.next();
        boolean result1 = compareUsingCharAt(a, b);

        boolean result2 = a.equals(b);

        System.out.println("Comparison using charAt(): " + result1);
        System.out.println("Comparison using equals(): " + result2);

        if (result1 == result2) {
            System.out.println(" Both methods give the same result.");
        } else {
            System.out.println("Methods give different results.");
        }
    }
}
