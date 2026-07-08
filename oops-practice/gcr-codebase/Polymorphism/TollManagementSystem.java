// Superclass
class Vehicles {
    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }

    void displayDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
    }
}

// Car Class
class Car extends Vehicle {

    Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 100;
    }
}

// Bus Class
class Bus extends Vehicle {

    Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 250;
    }
}

// Truck Class
class Truck extends Vehicle {

    Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 400;
    }
}

public class TollManagementSystem {

    // Calculate Total Revenue
    static double calculateTotalRevenue(Vehicle[] vehicles) {
        double totalRevenue = 0;

        for (Vehicle v : vehicles) {
            totalRevenue += v.calculateToll(); // Polymorphism
        }

        return totalRevenue;
    }

    // Search Vehicle
    static void searchVehicle(Vehicle[] vehicles, String vehicleNumber) {
        boolean found = false;

        for (Vehicle v : vehicles) {
            if (v.vehicleNumber.equals(vehicleNumber)) {
                System.out.println("\nVehicle Found:");
                v.displayDetails();
                System.out.println("Toll Paid : ₹" + v.calculateToll());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nVehicle not found.");
        }
    }

    // Highest Toll Vehicle
    static void displayHighestTollVehicle(Vehicle[] vehicles) {
        Vehicle highest = vehicles[0];

        for (Vehicle v : vehicles) {
            if (v.calculateToll() > highest.calculateToll()) {
                highest = v;
            }
        }

        System.out.println("\n=== Vehicle Paying Highest Toll ===");
        highest.displayDetails();
        System.out.println("Highest Toll : ₹" + highest.calculateToll());
    }

    // Count Vehicle Types
    static void countVehicleTypes(Vehicle[] vehicles) {
        int carCount = 0;
        int busCount = 0;
        int truckCount = 0;

        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                carCount++;
            } else if (v instanceof Bus) {
                busCount++;
            } else if (v instanceof Truck) {
                truckCount++;
            }
        }

        System.out.println("\n=== Vehicle Count ===");
        System.out.println("Cars   : " + carCount);
        System.out.println("Buses  : " + busCount);
        System.out.println("Trucks : " + truckCount);
    }
}

    