import java.util.Scanner;

class LeepYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        boolean isLeapYear = false;

        // Check if the year is a leap year
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true; // Divisible by 400
                } else {
                    isLeapYear = false; // Divisible by 100 but not by 400
                }
            } else {
                isLeapYear = true; // Divisible by 4 but not by 100
            }
        } else {
            isLeapYear = false; // Not divisible by 4
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}