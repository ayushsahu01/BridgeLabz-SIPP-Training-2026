import java.util.*;
public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException Handled");
        }
        sc.close();
    }
}