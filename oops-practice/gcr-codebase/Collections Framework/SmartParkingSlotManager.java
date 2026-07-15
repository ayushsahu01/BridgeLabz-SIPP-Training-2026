import java.util.ArrayList;

public class SmartParkingSlotManager {

    static ArrayList<String> parking = new ArrayList<>();

    static void addVehicle(String regNo) {
        parking.add(regNo);
        System.out.println(regNo + " entered the parking.");
    }

    static void removeVehicle(String regNo) {
        if (parking.remove(regNo))
            System.out.println(regNo + " exited the parking.");
        else
            System.out.println("Vehicle not found.");
    }

    static void searchVehicle(String regNo) {
        if (parking.contains(regNo))
            System.out.println(regNo + " is currently parked.");
        else
            System.out.println(regNo + " is not parked.");
    }

    static void displayVehicles() {
        System.out.println("\nParked Vehicles:");
        for (String vehicle : parking) {
            System.out.println(vehicle);
        }
        System.out.println("Total Occupied Slots: " + parking.size());
    }

    public static void main(String[] args) {

        addVehicle("UP93AB1234");
        addVehicle("MP20CD5678");
        addVehicle("DL01EF9876");

        displayVehicles();

        searchVehicle("MP20CD5678");

        removeVehicle("UP93AB1234");

        displayVehicles();
    }
}