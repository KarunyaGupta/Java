import java.util.*;
class DisplayDays{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day between 1 to 7 ");

        int day = input.nextInt();
        switch(day){
            case 1:
                System.out.println("Chest Day");
                break;
            case 2:
                System.out.println("Back Day");
                break;

            case 3:
                System.out.println("Shoulder Day");
                break;
            case 4:
                System.out.println("Omg Leg day");
                break;
            case 5:
                System.out.println("Chest and Back Day");
                break;
            case 6:
                System.out.println("burhhh Arms Day");
                break;

            case 7:
                System.out.println("Rest Day");
                break;
            default : 
                System.out.println("Enter a valid day");
            


        }
    }
}