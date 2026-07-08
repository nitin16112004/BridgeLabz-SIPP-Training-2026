public class Drone {
   
    private String droneId;
    private int batteryPercentage;

    static String companyName = "Sky Logistics";

    Drone(String droneId, int batteryPercentage) {
        this.droneId = droneId;              
        this.batteryPercentage = batteryPercentage;
    }

    void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println("Drone " + droneId + " started delivery.");
        } else {
            System.out.println("Drone " + droneId
                    + " cannot start delivery. Low battery!");
        }
    }

    void displayStatus() {
        System.out.println("\nCompany Name      : " + companyName);
        System.out.println("Drone ID          : " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
    }
}

