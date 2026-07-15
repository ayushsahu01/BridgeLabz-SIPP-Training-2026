import java.util.*;

public class CoffeeCounterChronicles {
    public static void main(String args[]) {
        System.out.println("Welcome to the Coffee Counter Chronicles!");
        Scanner sc = new Scanner(System.in);
        String nextOrder = "yes";
        while (nextOrder.equals("yes")) {
            System.out.print("Enter you a Number for selecting coffee type: \n1 for Espresso \n2 for Latte \n3 for Cappuccino\n");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    System.out.println("You have selected Espresso. " + "Price : 250");

                    break;
                case 2:
                    System.out.println("You have selected Latte. " + "Price : 300");
                    break;
                case 3:
                    System.out.println("You have selected Cappuccino. " + "Price : 350");
                    break;
                default:
                    System.out.println("Invalid selection. Please choose a valid coffee type.");
            }
            System.out.println("Please Enter the Quantity of Coffee you want to order: ");
            int quantity = sc.nextInt();
            int price = 0;

            switch (type) {
                case 1:
                    price = 250;
                    break;
                case 2:
                    price = 300;
                    break;
                case 3:
                    price = 350;
                    break;
                default:
                    System.out.println("Invalid selection. Please choose a valid coffee type.");
            }

            int Bill = price * quantity;
            float finalBill = Bill * (5f / 100);
            float totalBill = Bill + finalBill;

            System.out.println("Final Bill (including tax): " + totalBill);
            System.out.println("For Next Order Press yes or for exit Press exit");
            nextOrder = sc.next();
            if(nextOrder.equals("exit")){
                break;
            }
        }
        sc.close();
    }
}
