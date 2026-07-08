class ChargingStation {
    static int totalStations = 0;
    static double electricityRate = 8.5; 

    private String stationId;
    private double unitsConsumed;

    ChargingStation(String stationId, double unitsConsumed) {
        this.stationId = stationId;          
        this.unitsConsumed = unitsConsumed;
        totalStations++;                    
    }

    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    void displayStationDetails() {
        System.out.println("Station ID      : " + stationId);
        System.out.println("Units Consumed  : " + unitsConsumed);
        System.out.println("Electricity Rate: ₹" + electricityRate + " per unit");
        System.out.println("Bill Amount     : ₹" + calculateBill());
        System.out.println();
    }
}

