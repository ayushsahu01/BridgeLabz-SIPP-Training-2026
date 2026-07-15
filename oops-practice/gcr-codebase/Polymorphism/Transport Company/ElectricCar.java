class ElectricCar extends Vehicle {

    ElectricCar(String model) {
        super(model);
    }

    @Override
    double fuelCost(double km) {
        return km * 2;
    }
}