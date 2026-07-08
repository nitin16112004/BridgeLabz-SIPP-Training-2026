// Superclass
class Device {
    protected String deviceId;
    protected String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display status
    public void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + status);
    }
}

// Subclass
class Thermostat extends Device {
    private double temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status,
                      double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus()
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting : "
                           + temperatureSetting + "°C");
    }
}

