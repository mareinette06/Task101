package Challenges;
 import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal: " + num1);
        } else {
            double largest = findLargestNumber(num1, num2, num3);
            System.out.println("The largest number is: " + largest);
        }

        scanner.close();
    }

    public static double findLargestNumber(int num1, int num2, int num3) {
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        return largest;
    }
}