import java.util.*;
public class PalindromeCheck {
    static boolean method1(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean method2(String str, int start, int end) {
        if (start >= end) return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return method2(str, start + 1, end - 1);
    }

    static boolean method3(String str) {
        char[] original = str.toCharArray();
        char[] reverse = new char[original.length];

        for (int i = 0; i < original.length; i++)
            reverse[i] = original[original.length - 1 - i];

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i])
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println("Method 1: " + method1(text));
        System.out.println("Method 2: " + method2(text, 0, text.length() - 1));
        System.out.println("Method 3: " + method3(text));
        sc.close();
    }
}