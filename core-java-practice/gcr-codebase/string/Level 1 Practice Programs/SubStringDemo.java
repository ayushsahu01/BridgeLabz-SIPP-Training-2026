import java.util.*;
public class SubStringDemo {
    public static String createSubString(String text, int start, int end) {
        String sub = "";

        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }
        return sub;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String userSub = createSubString(text, start, end);
        String builtInSub = text.substring(start, end);

        System.out.println("User Substring: " + userSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Equal: " + userSub.equals(builtInSub));
        sc.close();
    }
}