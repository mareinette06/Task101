package Challenges;

import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input words or sentence.");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

        public static int countWords(String input) {
            if (input == null || input.isEmpty()) {
                return 0;
 }
                String[] words = input.split("\\s+");
                        return words.length;
            }
}
