public class Main {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 250);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle");
        ev.display();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle");
        pv.display();
        pv.refuel();

        System.out.println("\nInheritance Check:");
        System.out.println("ElectricVehicle IS-A Vehicle: "
                + (ev instanceof Vehicle));
        System.out.println("PetrolVehicle IS-A Vehicle: "
                + (pv instanceof Vehicle));
        System.out.println("PetrolVehicle implements Refuelable: "
                + (pv instanceof Refuelable));
    }
}