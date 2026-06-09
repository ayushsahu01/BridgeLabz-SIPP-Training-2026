//Question 4: Number of Steps to Reduce a Number to Zero

import java.util.*;;
public class NumberofStepstoReduceaNumbertoZero {

    public static int numberOfSteps(int num) {

        int count = 0;

        while (num != 0) {

            if (num % 2 == 0) {
                num = num / 2;
                count++;
            }
            else {
                num = num - 1;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int ans = numberOfSteps(num);

        System.out.println("Number of Steps = " + ans);

        sc.close();
    }
}