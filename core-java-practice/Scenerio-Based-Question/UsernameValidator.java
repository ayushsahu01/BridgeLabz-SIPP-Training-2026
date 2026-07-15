import java.util.*;
public class UsernameValidator {

    public static boolean isPalindrome(String username) {
        String reversed = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            reversed += username.charAt(i);
        }
        return username.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        if (username.contains(" ")) {
            System.out.println("Username contains spaces.");
        } else {
            System.out.println("Username does not contain spaces.");
        }

        System.out.println("Total Characters: " + username.length());

        System.out.println("Uppercase Username: " + username.toUpperCase());

        if (isPalindrome(username)) {
            System.out.println("Username is a Palindrome.");
        } else {
            System.out.println("Username is not a Palindrome.");
        }
        sc.close();
    }
}