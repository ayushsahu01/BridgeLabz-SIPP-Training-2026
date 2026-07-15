import java.util.*;
public class UpperCaseDemo {
    public static String convertUpper(String text) {

        String result = "";
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String upper1 = convertUpper(text);
        String upper2 = text.toUpperCase();

        System.out.println(upper1);
        System.out.println(upper2);
        System.out.println(upper1.equals(upper2));
        sc.close();
    }
}