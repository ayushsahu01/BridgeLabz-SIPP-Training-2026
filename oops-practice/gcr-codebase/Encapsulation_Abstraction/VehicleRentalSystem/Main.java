public class Main {

    public static void main(String[] args) {

        int days = 5;

        Car car = new Car("UP93AB1234", "Car", 2000);
        Bike bike = new Bike("UP93XY5678", "Bike", 600);
        Truck truck = new Truck("UP93TR9999", "Truck", 3500, 1500);

        System.out.println("===== Car =====");
        car.displayVehicleInfo();
        System.out.println("Rental Cost : ₹" + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("===== Bike =====");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost : ₹" + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("===== Truck =====");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost : ₹" + truck.calculateRentalCost(days));
    }
}