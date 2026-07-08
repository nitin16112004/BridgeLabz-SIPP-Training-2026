// Interface
interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle {
    protected int maxSpeed;
    protected String model;

    // Constructor
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    // Display vehicle details
    public void displayInfo() {
        System.out.println("Model      : " + model);
        System.out.println("Max Speed  : " + maxSpeed + " km/h");
    }
}

// Subclass ElectricVehicle
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}

// Subclass PetrolVehicle implementing Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is being refueled.");
    }
}

