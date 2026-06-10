import java.util.*;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int reminder = number1 % number2;

        System.out.println("The Quotient is " + quotient
                + " and Reminder is " + reminder
                + " of two number " + number1
                + " and " + number2);
        input.close();
    }
}