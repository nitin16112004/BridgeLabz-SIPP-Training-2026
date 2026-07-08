class WaterBottle {
    // Instance variables
    String ownerName;
    int dailyTarget; // in milliliters

    // Constructor
    WaterBottle(String ownerName, int dailyTarget) {
        this.ownerName = ownerName;
        this.dailyTarget = dailyTarget;
    }

    // Method to display bottle information
    void displayBottleInfo() {
        System.out.println("Owner Name  : " + ownerName);
        System.out.println("Daily Target: " + dailyTarget + " ml");
        System.out.println();
    }
}

