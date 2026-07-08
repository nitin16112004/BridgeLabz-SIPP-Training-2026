import java.util.*;

public class SmartCityTrafficMonitoring {

    static HashMap<String, Integer> trafficMap = new HashMap<>();

    public static void updateTraffic(String roadName, int vehicleCount) {

        if (trafficMap.containsKey(roadName)) {
            trafficMap.put(roadName, trafficMap.get(roadName) + vehicleCount);
            System.out.println("Updated traffic on " + roadName);
        } else {
            trafficMap.put(roadName, vehicleCount);
            System.out.println("Added " + roadName);
        }
    }

    
    public static void displaySortedRoads() {

        TreeMap<String, Integer> sortedMap = new TreeMap<>(trafficMap);

        System.out.println("\nRoads (Sorted):");

        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + " vehicles");
        }
    }

    public static void busiestRoad() {

        String busiest = "";
        int maxVehicles = 0;

        for (Map.Entry<String, Integer> entry : trafficMap.entrySet()) {

            if (entry.getValue() > maxVehicles) {
                maxVehicles = entry.getValue();
                busiest = entry.getKey();
            }
        }

        System.out.println("\nBusiest Road: " + busiest);
        System.out.println("Vehicle Count: " + maxVehicles);
    }

   
    public static void trafficReport() {

        System.out.println("\nTraffic Analysis Report");

        for (Map.Entry<String, Integer> entry : trafficMap.entrySet()) {

            String status;

            if (entry.getValue() >= 100) {
                status = "Heavy Traffic";
            } else if (entry.getValue() >= 50) {
                status = "Moderate Traffic";
            } else {
                status = "Low Traffic";
            }

            System.out.println(entry.getKey() + " -> "
                    + entry.getValue() + " vehicles (" + status + ")");
        }

        System.out.println("\nTotal Roads Monitored: " + trafficMap.size());
    }

    public static void main(String[] args) {

        updateTraffic("MG Road", 120);
        updateTraffic("Ring Road", 75);
        updateTraffic("Airport Road", 40);
        updateTraffic("Station Road", 90);

        updateTraffic("Ring Road", 30);

        displaySortedRoads();

        busiestRoad();

        trafficReport();
    }
}