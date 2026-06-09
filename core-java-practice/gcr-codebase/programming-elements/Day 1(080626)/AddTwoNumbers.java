import java.util.*;
public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        sc.close();
    }
}
