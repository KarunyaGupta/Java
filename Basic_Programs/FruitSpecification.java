import java.util.*;
class FruitSpecification{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of fruit : ");

        String fruit = input.nextLine();

        String color = "No color";
        // String season;
        int price =0; // initilisation is possible

        switch(fruit){
            case "apple": 
                color = "red";
                price = 200;
                break;
            case "mango":
                color = "yellow";
                price = 300;
                break;
            default:
                System.out.println("Invalid input");

        }

        System.out.println(fruit +":");
        System.out.println("color =" + color);
        System.out.println("price = " + price);
    }
}