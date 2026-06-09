//Question 2: Reverse Integer

import java.util.*;
public class Q2ReverseInteger {

    public static int reverse(int x) {

        int res = 0;

        while (x != 0) {

            int rem = x % 10;

            if (res < Integer.MIN_VALUE / 10 || 
                res > Integer.MAX_VALUE / 10) {
                return 0;
            }

            res = res * 10 + rem;

            x = x / 10;
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int x = sc.nextInt();

        int ans = reverse(x);

        System.out.println("Reversed Number = " + ans);

        sc.close();
    }
}