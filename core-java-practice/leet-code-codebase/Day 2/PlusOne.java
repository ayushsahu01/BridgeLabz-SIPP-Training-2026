//Question 4: PlusOne

import java.util.*;
public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            else {
                digits[i] = 0;
            }
        }

        int[] arr = new int[n + 1];

        arr[0] = 1;

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        int[] digits = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int[] result = plusOne(digits);

        System.out.println("Result Array = " + Arrays.toString(result));

        sc.close();
    }
}