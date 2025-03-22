abstract class ElectronicDevice {
    private String brand;
    private boolean isOn;
    
    ElectronicDevice(String brand) {
        this.brand = brand;
        this.isOn = false;
    }
    
    // Abstract method - must be implemented by child
    abstract void start();
    
    // Non-abstract method - can be inherited as is
    public void turnOff() {
        isOn = false;
        System.out.println("Device turned off");
    }
    
    public String getBrand() {
        return brand;
    }
}

interface Rechargeable {
    void recharge();
    // All interface methods are public abstract by default
    int getBatteryLevel();
}

class SmartPhone extends ElectronicDevice implements Rechargeable {
    private int batteryLevel;
    
    SmartPhone(String brand) {
        super(brand);
        this.batteryLevel = 50;
    }
    
    @Override
    void start() {
        System.out.println(getBrand() + " smartphone is starting...");
    }
    
    @Override
    public void recharge() {
        batteryLevel = 100;
        System.out.println("Phone is fully charged!");
    }
    
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }
}

public class Important2 {
    public static void main(String[] args) {
        // System.out.println("Demonstrating differences between Abstract Class and Interface:");
        // System.out.println("1. Abstract class can have constructor, Interface cannot");
        // System.out.println("2. Abstract class can have both abstract and non-abstract methods");
        // System.out.println("3. Class can implement multiple interfaces but extend only one abstract class");
        // System.out.println("4. Interface methods are public by default\n");
        
        SmartPhone phone = new SmartPhone("Samsung");
        
        // Using methods from abstract class
        phone.start();  // Abstract method
        phone.turnOff(); // Non-abstract method
        
        // Using methods from interface
        System.out.println("Battery Level: " + phone.getBatteryLevel() + "%");
        phone.recharge();
        System.out.println("Battery Level after recharge: " + phone.getBatteryLevel() + "%");
    }
}
