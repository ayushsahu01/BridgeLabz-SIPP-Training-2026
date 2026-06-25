class Bike extends Vehicle {

    Bike(String model) {
        super(model);
    }

    @Override
    double fuelCost(double km) {
        return km * 3;
    }
}