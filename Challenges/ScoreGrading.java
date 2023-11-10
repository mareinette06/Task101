package Challenges;

import java.util.Scanner;

public class ScoreGrading {
    public static void main(String[] args) {
        System.out.println("Enter a valid students test score: ");
        Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt()){
            int score = scan.nextInt();
            if (score >= 90) {
                System.out.println("The students grade is: A");
            } else if (score >= 80&& score < 90) {
                System.out.println("The students grade is: B");
            }  else if (score >= 70&& score < 80) {
            System.out.println("The students grade is: C");
            }  else if (score >= 60&& score < 70) {
                System.out.println("The students grade is: D");
            }  else if (score < 60 && score >= 0) {
                System.out.println("The students grade is: F");}
            else {
                System.out.println("The Test Score cannot be a negative number");
            }
     //       System.out.println("Success");
        } else {
            System.out.println("Your input is not a valid number: ");
        }

    }
}
