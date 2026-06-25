abstract class Vehicle {
    String model;

    Vehicle(String model) {
        this.model = model;
    }

    abstract double fuelCost(double km);
}