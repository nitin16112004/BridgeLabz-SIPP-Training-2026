class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    // Constructor using this keyword
    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }

    // Method to display all cars
    static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars in Parking:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    // Method to display all bikes
    static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes in Parking:");
        for (Vehicle v : vehicles) {
            if (v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }
}

