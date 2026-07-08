class SpaceTourist {

    // Static variables
    static int totalReservations = 0;
    static String missionName = "Mars Explorer";

    // Instance variables
    String touristName;
    int seatNumber;

    // Constructor
    SpaceTourist(String touristName, int seatNumber) {
        this.touristName = touristName; // using this keyword
        this.seatNumber = seatNumber;
        totalReservations++;
    }

    // Method to update seat number and return current object
    SpaceTourist updateSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Mission Name      : " + missionName);
        System.out.println("Tourist Name      : " + touristName);
        System.out.println("Seat Number       : " + seatNumber);
        System.out.println("Total Reservations: " + totalReservations);
    }
}

