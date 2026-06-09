//Question 1: Palindrome Number
import java.util.*;
public class Q1PalindromeNumber {

    public static boolean isPalindrome(int x) {

        int temp = x;
        int res = 0;

        while (x > 0) {
            int rem = x % 10;
            res = res * 10 + rem;
            x = x / 10;
        }

        return temp == res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome Number");
        } else {
            System.out.println(num + " is not a Palindrome Number");
        }

        sc.close();
    }
}