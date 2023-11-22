package Challenges;

import java.util.Scanner;

public class Numbertomonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number representing a month (1-12): ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            String monthName = getMonthName(monthNumber);
            int daysInMonth = getDaysInMonth(monthNumber);

            System.out.println("Month: " + monthName);
            System.out.println("Number of days: " + daysInMonth);
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    public static String getMonthName(int monthNumber) {
        switch (monthNumber) {
     //       case 1:
     //           System.out.println("January");
     //           break;
            //      case 2:
     //           System.out.println("February");
       //         break;
      //      case 3:
      //          System.out.println("March");
      //          break;
      //      case 4:
      //          System.out.println("April");
       //         break;
        //    case 5:
        //        System.out.println("May");
       //         break;
        //    case 6:
         //       System.out.println("June");
         //       break;
         //   case 7:
         //       System.out.println("July");
           //     break;
          //  case 8:
            //    System.out.println("August");
          //      break;
          //  case 9:
          //      System.out.println("September");
          //      break;
          //  case 10:
         //       System.out.println("October");
         //       break;
        //    case 11:
         //       System.out.println("November");
         //       break;
         //   case 12:
        //        System.out.println("December");
        //        break;
            //
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
           case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
           case 11: return "November";
            case 12: return "December";
            default: return "Invalid";
        }
    }

    public static int getDaysInMonth(int monthNumber) {
        switch (monthNumber) {
            case 1: case 3: case 5:      case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // Assuming a non-leap year for simplicity
            default:
                return -1; // Invalid month
        }
    }
}