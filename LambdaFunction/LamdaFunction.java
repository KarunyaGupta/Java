import java.util.*;

interface Greeting{
    void greet();
}
class LamdaFunction{
    public static void main(String[] args){
        // Greeting greet = (name) -> System.out.println("Hello, " + name + "!");
        // greet.greet("World");
        Greeting greet = () -> {
            System.out.println("Hello, World!");
        };
        greet.greet();
    }
}