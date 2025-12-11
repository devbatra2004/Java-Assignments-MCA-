// NAME - DEV   ROLL_NO - 2510987011
// Program: Return all characters in a string manually and compare with toCharArray()

import java.util.*;

public class CharacterInString {

    static char[] manualCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static void displayArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();
        char[] manualArr = manualCharArray(text);

        char[] builtinArr = text.toCharArray();
        boolean isSame = compareArrays(manualArr, builtinArr);

        System.out.print("Manual char array: ");
        displayArray(manualArr);

        System.out.print("Built-in char array: ");
        displayArray(builtinArr);

        System.out.println("Are both arrays same? " + isSame);
    }
}
