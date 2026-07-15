import java.util.*;
public class StoryBasedSampleProgram {
    // Reverse a string
    public static String reverseMessage(String msg) {
        String reversed = "";
        for (int i = msg.length() - 1; i >= 0; i--) {
            reversed += msg.charAt(i);
        }
        return reversed;
    }

    // Check palindrome
    public static boolean isPalindrome(String msg) {
        String reversed = reverseMessage(msg);
        return msg.equalsIgnoreCase(reversed);
    }

    // Count vowels and consonants
    public static void countVowelsAndConsonants(String msg) {
        int vowels = 0;
        int consonants = 0;

        msg = msg.toLowerCase();

        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Check anagrams
    public static boolean areAnagrams(String str1, String str2) {
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

    // First non-repeating character
    public static char firstNonRepeatingCharacter(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Secret message
        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(message));

        if (isPalindrome(message)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is not a Palindrome");
        }

        countVowelsAndConsonants(message);

        // Anagram check
        System.out.print("Enter first intercepted message: ");
        String msg1 = sc.nextLine();

        System.out.print("Enter second intercepted message: ");
        String msg2 = sc.nextLine();

        if (areAnagrams(msg1, msg2)) {
            System.out.println("Messages are Anagrams");
        } else {
            System.out.println("Messages are not Anagrams");
        }

        // First non-repeating character
        System.out.print("Enter surveillance log: ");
        String log = sc.nextLine();

        char result = firstNonRepeatingCharacter(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}