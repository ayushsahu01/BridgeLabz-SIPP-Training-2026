import java.util.*;
public class StoryBasedSampleProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] incomes = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            incomes[i] = sc.nextDouble();
        }

        System.out.println("\n--- Tax Details ---");

        for (int i = 0; i < 10; i++) {

            double income = incomes[i];
            double tax;
            String bracket;

            if (income < 10000) {
                tax = income * 0.05;
                bracket = "5% Tax Bracket";
            }
            else if (income <= 50000) {
                tax = income * 0.15;
                bracket = "15% Tax Bracket";
            }
            else {
                tax = income * 0.30;
                bracket = "30% Tax Bracket";
            }

            totalTax += tax;

            System.out.println("Citizen " + (i + 1));
            System.out.println("Income : " + income);
            System.out.println("Bracket: " + bracket);
            System.out.println("Tax    : " + tax);
            System.out.println();
        }

        System.out.println("Total Tax Collected = " + totalTax);

        sc.close();
    }
}