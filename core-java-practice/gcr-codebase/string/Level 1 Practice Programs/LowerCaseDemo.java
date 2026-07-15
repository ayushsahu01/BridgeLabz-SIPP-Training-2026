import java.util.*;
public class LowerCaseDemo {
    public static String convertLower(String text) {

        String result = "";
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String lower1 = convertLower(text);
        String lower2 = text.toLowerCase();

        System.out.println(lower1);
        System.out.println(lower2);
        System.out.println(lower1.equals(lower2));
        sc.close();
    }
}