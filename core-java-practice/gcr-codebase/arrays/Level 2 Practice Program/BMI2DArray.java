import java.util.*;
public class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];

        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            while (true) {

                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();

                if (personData[i][0] > 0) {
                    break;
                }

                System.out.println("Invalid weight! Enter positive value.");
            }

            while (true) {

                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Invalid height! Enter positive value.");
            }
        }
        for (int i = 0; i < number; i++) {
            personData[i][2] =
                    personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (personData[i][2] >= 18.5 &&
                     personData[i][2] <= 24.9) {

                weightStatus[i] = "Normal";
            }
            else if (personData[i][2] >= 25.0 &&
                     personData[i][2] <= 39.9) {

                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n------ BMI REPORT ------");

        for (int i = 0; i < number; i++) {

            System.out.println("\nPerson " + (i + 1));

            System.out.println("Weight = " +
                    personData[i][0] + " kg");

            System.out.println("Height = " +
                    personData[i][1] + " m");

            System.out.printf("BMI = %.2f\n",
                    personData[i][2]);

            System.out.println("Status = " +
                    weightStatus[i]);
        }
        sc.close();
    }
}