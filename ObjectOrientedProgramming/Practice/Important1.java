abstract class Appliance {
    String brand;
    int voltage;
    
    Appliance(String brand, int voltage){ 
        this.brand = brand;
        this.voltage = voltage;
    }
    
    abstract double powerConsumption();
}

class Fan extends Appliance {
    int speed;
    double hours;
    
    Fan(String brand, int voltage) {
        super(brand, voltage);
        this.speed = 1;
        this.hours = 1.0;
    }
    
    Fan(String brand, int voltage, int speed, double hours) {
        super(brand, voltage);
        this.speed = speed;
        this.hours = hours;
    }
    
    @Override
    double powerConsumption() {
        return voltage * speed * hours * 0.1; // power calculation for fan
    }
}

class AirConditioner extends Appliance {
    double tonnage;
    double temperature;
    
    AirConditioner(String brand, int voltage) {
        super(brand, voltage);
        this.tonnage = 1.0;
        this.temperature = 24.0;
    }
    
    AirConditioner(String brand, int voltage, double tonnage, double temperature) {
        super(brand, voltage);
        this.tonnage = tonnage;
        this.temperature = temperature;
    }
    
    @Override
    double powerConsumption() {
        return voltage * tonnage * (temperature/10) * 0.5; // power calculation for AC
    }
}

public class Important1 {
    public static void main(String[] args) {
        Fan fan1 = new Fan("Havells", 220);
        Fan fan2 = new Fan("Orient", 220, 3, 8.5);
        
        AirConditioner ac1 = new AirConditioner("Daikin", 240);
        AirConditioner ac2 = new AirConditioner("Voltas", 240, 1.5, 18.0);
        
        System.out.println("Fan 1 Power Consumption: " + fan1.powerConsumption() + " units");
        System.out.println("Fan 2 Power Consumption: " + fan2.powerConsumption() + " units");
        System.out.println("AC 1 Power Consumption: " + ac1.powerConsumption() + " units");
        System.out.println("AC 2 Power Consumption: " + ac2.powerConsumption() + " units");
    }
}
