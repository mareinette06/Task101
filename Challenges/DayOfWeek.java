package Challenges;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");

        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            String dayOfWeek = getDayOfWeek(dayNumber);

            System.out.println("The day corresponding to " + dayNumber + " is " + dayOfWeek);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }

    private static String getDayOfWeek(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
            default:
                return "Invalid Day";
        }
    }
}
