import java.util.*;
public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Smart Card Balance: ₹");
        double balance = sc.nextDouble();

        while (balance > 0) {
            System.out.print("\nEnter Distance Travelled (km): ");
            double distance = sc.nextDouble();

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 :
                          (distance <= 15) ? 20 :
                          (distance <= 25) ? 30 : 40;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare Deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient Balance!");
                break;
            }

            System.out.print("Press Y to continue journey or N to quit: ");
            char choice = sc.next().charAt(0);

            if (choice == 'N' || choice == 'n') {
                break;
            }
        }

        System.out.println("\nSmart Card Session Ended.");
        System.out.println("Final Balance: ₹" + balance);

        sc.close();
    }
}