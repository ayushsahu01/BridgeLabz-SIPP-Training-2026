public class Main {
    public static void main(String[] args) {

        DeliveredOrder order = new DeliveredOrder(
                101,
                "24-06-2026",
                "TRK123456",
                "27-06-2026"
        );

        order.display();
        System.out.println("Order Status: " + order.getOrderStatus());

        System.out.println("\nInheritance Check:");
        System.out.println("DeliveredOrder IS-A ShippedOrder: "
                + (order instanceof ShippedOrder));
        System.out.println("DeliveredOrder IS-A Order: "
                + (order instanceof Order));
    }
}