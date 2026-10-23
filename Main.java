
/*
 * Main class
 * Creates gaming controller objects and demonstrates
 * getters, setters, selection structures, and looping.
 */

public class Main {

    public static void main(String[] args) {

        // Create an object using the default constructor
        GamingController controller1 = new GamingController();

        // Create an object using the parameterized constructor
        GamingController controller2 = new GamingController(
            "Microsoft", "Xbox Controller", 75, 60,
            299.00, "Wireless", false
        );

        // Demonstrate setter methods
        controller1.setBattery(50);
        controller1.setVolume(70);

        // Demonstrate getter methods
        System.out.println("=== GETTER EXAMPLE ===");
        System.out.println("Brand: " + controller1.getBrand());
        System.out.println("Model: " + controller1.getModel());
        System.out.println("Battery: " + controller1.getBattery() + "%");
        System.out.println("Volume: " + controller1.getVolume() + "%");
        System.out.println("Price: RM" + controller1.getPrice());

        // Selection structure: if-else
        System.out.println("\n=== BATTERY CHECK ===");

        if (controller2.getBattery() > 20) {
            System.out.println("Battery is sufficient.");
        } else {
            System.out.println("Low battery. Please charge.");
        }

        // Selection structure: switch
        System.out.println("\n=== BRAND CHECK ===");

        switch (controller1.getBrand()) {
            case "Sony":
                System.out.println("PlayStation controller selected.");
                break;

            case "Microsoft":
                System.out.println("Xbox controller selected.");
                break;

            default:
                System.out.println("Other gaming controller.");
        }

        // Demonstrate additional methods
        System.out.println("\n=== CONTROLLER OPERATIONS ===");
        controller2.turnOn();
        controller2.checkBattery();

        // Store both objects in an array
        GamingController[] controllers = {
            controller1, controller2
        };

        // Loop through the array to display each controller
        System.out.println("\n=== CONTROLLER DETAILS ===");

        for (int i = 0; i < controllers.length; i++) {
            System.out.println("\nController " + (i + 1));
            controllers[i].displayInfo();
        }
    }
}
