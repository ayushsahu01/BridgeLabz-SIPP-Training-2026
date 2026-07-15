import java.util.*;
public class IllegalArgumentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            System.out.println(text.substring(6, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException Handled");
        }
        sc.close();
    }
}