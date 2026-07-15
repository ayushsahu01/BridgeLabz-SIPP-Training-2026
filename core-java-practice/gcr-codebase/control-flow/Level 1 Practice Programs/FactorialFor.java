import java.util.*;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 1) {
            int factorial = 1;

            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial = " + factorial);
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}