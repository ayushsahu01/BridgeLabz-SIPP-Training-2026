import java.util.*;
public class TrimSpaces {
    public static String customTrim(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String custom = customTrim(text);
        String builtIn = text.trim();

        System.out.println("Custom Trim : " + custom);
        System.out.println("Built-in Trim : " + builtIn);
        System.out.println(custom.equals(builtIn));
        sc.close();
    }
}