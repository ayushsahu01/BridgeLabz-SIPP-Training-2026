class Bus extends Vehicle {

    Bus(String model) {
        super(model);
    }

    @Override
    double fuelCost(double km) {
        return km * 15; 
    }
}