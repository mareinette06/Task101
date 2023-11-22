package TaskNov16;

import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args) {
        // Example usage
        int sum1 = calculateSumRow1(4, 5, 10, 2, 8);

        // Display the result
        System.out.println("Sum of the Row1: " + sum1);

        int lengthSum = calculateLengthSum(4, 5, 10, 2, 8);
        System.out.println("Lenght of Row1: " + lengthSum);
    }

    // Integer variable arguments method to calculate sum
    public static int calculateSumRow1(int... numbers) {
        int sum = 0;

        // Add each integer to the sum
        for (int num : numbers) {
            sum += num;
        }

        return sum;
    }

    // Integer variable arguments method to calculate sum of lengths
    public static int calculateLengthSum(int... numbers) {
        int lengthSum = 0;

        // Add the length of each integer to the sum
        for (int num : numbers) {
            lengthSum += String.valueOf(num).length();
        }

        return lengthSum;
    }
}