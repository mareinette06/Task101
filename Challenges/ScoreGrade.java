package Challenges;

import java.util.Scanner;

public class ScoreGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's score: ");
        int score = scanner.nextInt();

        char grade = calculateGrade(score);

        System.out.println("The student's grade is: " + grade);

        scanner.close();
    }

    public static char calculateGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        }   else if (score <= 59) {
                return 'F';
        } else {
            return 'O';
        }
    }
}

