import java.util.*;
public class ElectricityBillCalculator {

    public static int acceptUnits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        return sc.nextInt();
    }

    public static double calculateBill(int units) {
        double bill;

        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 300) {
            bill = (100 * 1.5) + ((units - 100) * 2.5);
        } else {
            bill = (100 * 1.5) + (200 * 2.5) + ((units - 300) * 4.0);
        }
        return bill;
    }

    public static void displayBill(int units, double bill) {
        System.out.println("\n----- Electricity Bill -----");
        System.out.println("Units Consumed : " + units);
        System.out.println("Bill Amount    : Rs. " + bill);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        int units = acceptUnits();

        double billAmount = calculateBill(units);

        displayBill(units, billAmount);
    }
}