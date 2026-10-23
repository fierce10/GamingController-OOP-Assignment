
/*
 * GamingController class
 * Demonstrates encapsulation using private attributes,
 * constructors, getters, setters, and additional methods.
 */

public class GamingController {

    // Seven private attributes
    private String brand;
    private String model;
    private int battery;
    private int volume;
    private double price;
    private String connectionType;
    private boolean isOn;

    // Default constructor
    public GamingController() {
        brand = "Sony";
        model = "DualSense";
        battery = 100;
        volume = 50;
        price = 350.00;
        connectionType = "Wireless";
        isOn = false;
    }

    // Parameterized constructor
    public GamingController(String brand, String model, int battery,
                            int volume, double price,
                            String connectionType, boolean isOn) {
        this.brand = brand;
        this.model = model;
        setBattery(battery);
        setVolume(volume);
        this.price = price;
        this.connectionType = connectionType;
        this.isOn = isOn;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBattery() {
        return battery;
    }

    public int getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public boolean getIsOn() {
        return isOn;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Battery must be between 0 and 100
    public void setBattery(int battery) {
        if (battery >= 0 && battery <= 100) {
            this.battery = battery;
        }
    }

    // Volume must be between 0 and 100
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    // Additional method 1: Turn on the controller
    public void turnOn() {
        isOn = true;
        System.out.println(model + " is now ON.");
    }

    // Additional method 2: Check battery level
    public void checkBattery() {
        if (battery > 20) {
            System.out.println("Battery is sufficient.");
        } else {
            System.out.println("Low battery. Please charge.");
        }
    }

    // Additional method 3: Display controller information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery: " + battery + "%");
        System.out.println("Volume: " + volume + "%");
        System.out.println("Price: RM" + price);
        System.out.println("Connection: " + connectionType);
        System.out.println("Power: " + (isOn ? "ON" : "OFF"));
    }
}
