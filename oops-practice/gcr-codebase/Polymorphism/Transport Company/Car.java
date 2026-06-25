class Car extends Vehicle {

    Car(String model) {
        super(model);
    }

    @Override
    double fuelCost(double km) {
        return km * 8;
    }
}