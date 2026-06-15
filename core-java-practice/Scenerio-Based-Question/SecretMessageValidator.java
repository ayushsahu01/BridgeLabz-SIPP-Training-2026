import java.util.*;
public class SecretMessageValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Secret Code: ");
        String code = sc.nextLine();

        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;

        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else {
                specialChars++;
            }
        }

        boolean isStrong = (code.length() >= 8) &&
                           (digits >= 2) &&
                           (specialChars >= 1);

        System.out.println("\n===== Secret Code Report =====");
        System.out.println("Code Entered      : " + code);
        System.out.println("Length            : " + code.length());
        System.out.println("Vowels            : " + vowels);
        System.out.println("Consonants        : " + consonants);
        System.out.println("Digits            : " + digits);
        System.out.println("Special Characters: " + specialChars);

        if (isStrong) {
            System.out.println("Status            : STRONG CODE");
        } else {
            System.out.println("Status            : WEAK CODE");
        }

        sc.close();
    }
}