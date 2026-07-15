import java.util.*;
public class WordMatchSystem {

    public static boolean isAnagram(String str1, String str2) {

        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Skill Keyword: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second Skill Keyword: ");
        String str2 = sc.nextLine();

        System.out.println("\nFirst String (Uppercase): " + str1.toUpperCase());
        System.out.println("Second String (Uppercase): " + str2.toUpperCase());

        System.out.println("Length of First String: " + str1.length());
        System.out.println("Length of Second String: " + str2.length());

        if (isAnagram(str1, str2)) {
            System.out.println("\nResult: The skill keywords are ANAGRAMS.");
        } else {
            System.out.println("\nResult: The skill keywords are NOT ANAGRAMS.");
        }
        sc.close();
    }
}