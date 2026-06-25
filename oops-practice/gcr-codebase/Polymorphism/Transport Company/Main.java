public class Main {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla")
        };

        double km = 100;

        for (Vehicle v : fleet) {

            System.out.println("Model: " + v.model);
            System.out.println("Fuel Cost for " + km + " km = ₹" + v.fuelCost(km));

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car.");
            }
            else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus.");
            }
            else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a Bike.");
            }
            else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car.");
            }
            System.out.println("----------------------------");
        }
    }
}