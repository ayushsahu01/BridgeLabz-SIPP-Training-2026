import java.util.*;
public class DeliveryChargeSystem {

    public static double calculateCharge(int distance) {
        return distance * 5;
    }

    public static double calculateCharge(int distance, int weight) {
        return (distance * 5) + (weight * 10);
    }

    public static double calculateCharge(int distance, int weight, boolean expressDelivery) {
        double charge = (distance * 5) + (weight * 10);

        if (expressDelivery) {
            charge += 100;
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Option:");
        System.out.println("1. Distance Only");
        System.out.println("2. Distance + Weight");
        System.out.println("3. Distance + Weight + Express Delivery");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        double finalCharge = 0;

        switch (choice) {

            case 1:
                System.out.print("Enter Distance (km): ");
                int distance1 = sc.nextInt();

                finalCharge = calculateCharge(distance1);
                break;

            case 2:
                System.out.print("Enter Distance (km): ");
                int distance2 = sc.nextInt();

                System.out.print("Enter Weight (kg): ");
                int weight2 = sc.nextInt();

                finalCharge = calculateCharge(distance2, weight2);
                break;

            case 3:
                System.out.print("Enter Distance (km): ");
                int distance3 = sc.nextInt();

                System.out.print("Enter Weight (kg): ");
                int weight3 = sc.nextInt();

                System.out.print("Express Delivery (true/false): ");
                boolean express = sc.nextBoolean();

                finalCharge = calculateCharge(distance3, weight3, express);
                break;

            default:
                System.out.println("Invalid Choice!");
                System.exit(0);
        }

        System.out.println("\nFinal Delivery Charge: Rs. " + finalCharge);

        sc.close();
    }
}