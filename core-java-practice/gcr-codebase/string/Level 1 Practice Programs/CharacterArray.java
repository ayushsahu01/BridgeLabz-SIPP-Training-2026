import java.util.*;
public class CharacterArray {
    public static char[] getChars(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        System.out.println("User Array:");
        for (char ch : arr1) {
            System.out.print(ch + " ");
        }

        System.out.println("\nBuilt-in Array:");
        for (char ch : arr2) {
            System.out.print(ch + " ");
        }
        sc.close();
    }
}