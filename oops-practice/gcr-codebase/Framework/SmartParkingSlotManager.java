import java.util.*;

public class SmartParkingSlotManager {

    // ArrayList to store parked vehicles
    static ArrayList<String> parkingList = new ArrayList<>();

    // Add Vehicle
    public static void addVehicle(String regNo) {

        if (parkingList.contains(regNo)) {
            System.out.println("Vehicle is already parked.");
        } else {
            parkingList.add(regNo);
            System.out.println(regNo + " entered the parking area.");
        }
    }

    // Remove Vehicle
    public static void removeVehicle(String regNo) {

        if (parkingList.remove(regNo)) {
            System.out.println(regNo + " exited the parking area.");
        } else {
            System.out.println("Vehicle not found.");
        }
    }

    // Search Vehicle
    public static void searchVehicle(String regNo) {

        if (parkingList.contains(regNo)) {
            System.out.println(regNo + " is currently parked.");
        } else {
            System.out.println(regNo + " is not parked.");
        }
    }

    // Display All Vehicles
    public static void displayVehicles() {

        if (parkingList.isEmpty()) {
            System.out.println("Parking area is empty.");
            return;
        }

        System.out.println("\nVehicles Currently Parked:");

        for (String vehicle : parkingList) {
            System.out.println(vehicle);
        }

        System.out.println("\nTotal Occupied Parking Slots: " + parkingList.size());
    }

    public static void main(String[] args) {

        addVehicle("UP32AB1234");
        addVehicle("DL01CD5678");
        addVehicle("MH12EF9012");

        System.out.println();

        searchVehicle("DL01CD5678");

        System.out.println();

        removeVehicle("DL01CD5678");

        System.out.println();

        displayVehicles();
    }
}