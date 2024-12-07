import java.util.*;
class NestedSwitch{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

        switch(empID){
            case 1:
                System.out.println("Karunya Gupta");
                break;
            case 2:
                System.out.println("Xyz");
                break;
            case 3:
                System.out.println("Emp number 3");
                //String department = input.next();
                switch(department){

                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default : 
                    System.out.println("No Department occure");
                }
                break;
            default:
                System.out.println("ID not available");

        }
    }
}