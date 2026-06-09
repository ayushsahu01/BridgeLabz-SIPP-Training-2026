//Question 3: Q3-Subtract-the-Product-and-Sum-Of-Digits-of-an-Integer

import java.util.*;
public class SubtracttheProductandSumofDigits {

    public static int subtractProductAndSum(int n) {

        int pro = 1;
        int sum = 0;

        while (n != 0) {

            int rem = n % 10;

            pro *= rem;
            sum += rem;

            n = n / 10;
        }

        int result = pro - sum;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        int ans = subtractProductAndSum(n);

        System.out.println("Result = " + ans);

        sc.close();
    }
}