//Question 1: FizzBuzz

import java.util.*;
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {

        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                res.add("Fizz");
            }
            else if (i % 5 == 0) {
                res.add("Buzz");
            }
            else {
                res.add(String.valueOf(i));
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");

        int n = sc.nextInt();

        List<String> ans = fizzBuzz(n);

        System.out.println(ans);

        sc.close();
    }
}