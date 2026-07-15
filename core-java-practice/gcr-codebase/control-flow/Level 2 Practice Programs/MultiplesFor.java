import java.util.*;
public class MultiplesFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number > 0 && number < 100) {

            for (int i = 100; i >= 1; i--) {

                if (i % number == 0) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Enter number between 1 and 99");
        }
        sc.close();
    }
}