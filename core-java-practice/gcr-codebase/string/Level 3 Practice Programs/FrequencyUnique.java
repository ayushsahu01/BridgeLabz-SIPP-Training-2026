import java.util.*;
public class FrequencyUnique {
    static char[] uniqueChars(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                temp[index++] = text.charAt(i);
        }

        char[] result = new char[index];
        System.arraycopy(temp, 0, result, 0, index);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = uniqueChars(text);

        System.out.println("Character\tFrequency");

        for (char c : unique) {
            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                if (c == text.charAt(i))
                    count++;
            }

            System.out.println(c + "\t\t" + count);
        }
        sc.close();
    }
}