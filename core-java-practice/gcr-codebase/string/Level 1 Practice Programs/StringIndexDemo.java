import java.util.*;
public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled");
        }
        sc.close();
    }
}