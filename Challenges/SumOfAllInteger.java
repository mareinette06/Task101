package Challenges;

import java.util.Scanner;

public class SumOfAllInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter 0 to finish):");

        int sum = 0;
        int input;

        do {
            System.out.print("Enter an integer: ");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println("The sum of all entered integers is: " + sum);

        scanner.close();
    }
}