// Parent class
abstract class Vehicle {
    abstract double fuelCost(int km);
}

// Car class
class Car extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 6.5;
    }
}

// Bus class
class Bus extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 12.0;
    }
}

// Bike class
class Bike extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 2.5;
    }
}

// New class added without changing existing code
class ElectricCar extends Vehicle {
    @Override
    double fuelCost(int km) {
        return km * 1.2; // electricity cost
    }
}

