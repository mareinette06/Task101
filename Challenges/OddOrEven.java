package Challenges;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("The number is positive ");
        } else if (number < 0) {
            System.out.println("The number is negative ");
        } else {
            System.out.println("The number is zero."); }

        if (number % 2 == 0 ) {
            System.out.println("The number is even ");
        } else {
            System.out.println("The number is odd ");
            }

        }
    }