import java.util.*;

interface Greeting{
    void greet(String name);
}
class LambdaFirstCode{
    public static void main(String[] args){
        Greeting greet = (name) -> System.out.println("Hello, " + name + "!");
        greet.greet("World");
    }
}