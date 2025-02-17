//  You need to create a Temperature Converter 
//  class that supports converting between Celsius, Fahrenheit, and Kelvin. 
//  How will you implement method overloading for this?


class Temp {
    
    public static double tempConv(int degC) {
        return degC + 273.15;
    }

    public static double tempConv(double degC) {
        return (degC * 9/5) + 32;
    }

    public static double tempConv(double degF, boolean isFahrenheit) {
        if (isFahrenheit) {
            return (degF - 32) * 5/9;
        }
        return degF;
    }

    public static double tempConv(double kelvin, String scale) {
        if (scale.equalsIgnoreCase("Kelvin")) {
            return kelvin - 273.15;
        }
        return kelvin;
    }

    public static double tempConv(double kelvin, boolean isKelvin, boolean toFahrenheit) {
        if (isKelvin && toFahrenheit) {
            return (kelvin - 273.15) * 9/5 + 32;
        }
        return kelvin;
    }

    public static double tempConv(double degF, boolean isFahrenheit, String scale) {
        if (isFahrenheit && scale.equalsIgnoreCase("Kelvin")) {
            return (degF - 32) * 5/9 + 273.15;
        }
        return degF;
    }
    
    public static void main(String[] args) {
        System.out.println("25°C to Kelvin: " + tempConv(25));
        System.out.println("25°C to Fahrenheit: " + tempConv(25.0));
        System.out.println("77°F to Celsius: " + tempConv(77.0, true));
        System.out.println("300K to Celsius: " + tempConv(300.0, "Kelvin"));
        System.out.println("300K to Fahrenheit: " + tempConv(300.0, true, true));
        System.out.println("77°F to Kelvin: " + tempConv(77.0, true, "Kelvin"));
    }
}