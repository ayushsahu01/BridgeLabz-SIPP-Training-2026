import java.util.*;
public class RestaurantBillingSystem {

    public static double calculateFoodCost(double price, int quantity) {
        return price * quantity;
    }

    public static double calculateGST(double foodCost) {
        return foodCost * 0.05;
    }

    public static double calculateDiscount(double amount) {
        return amount * 0.10;
    }

    public static double generateFinalBill(double foodCost, double gst, double discount) {
        return foodCost + gst - discount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Food Item Name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter Price per Item: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        double foodCost = calculateFoodCost(price, quantity);
        double gst = calculateGST(foodCost);
        double discount = calculateDiscount(foodCost);
        double finalBill = generateFinalBill(foodCost, gst, discount);

        System.out.println("\n------ Restaurant Bill ------");
        System.out.println("Food Item      : " + itemName);
        System.out.println("Price          : Rs. " + price);
        System.out.println("Quantity       : " + quantity);
        System.out.println("Food Cost      : Rs. " + foodCost);
        System.out.println("GST (5%)       : Rs. " + gst);
        System.out.println("Discount (10%) : Rs. " + discount);
        System.out.println("-----------------------------");
        System.out.println("Final Payable Amount : Rs. " + finalBill);
        System.out.println("-----------------------------");
        sc.close();
    }
}