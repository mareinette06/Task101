package Challenges;

import java.util.Scanner;

public class AreYouAPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputPalindrome = scanner.nextLine().toLowerCase();

        inputPalindrome = inputPalindrome.replaceAll("[^a-zA-Z]", "");

        boolean isPalindrome = true;
        for (int i = 0; i < inputPalindrome.length() / 2; i++) {
            if (inputPalindrome.charAt(i) != inputPalindrome.charAt(inputPalindrome.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }

}
