package Challenges;

import java.util.Scanner;

public class StingMethod {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
                String word = scan.nextLine();
                scan.close();

        System.out.println("Length: " + word.length());
        System.out.println("Uppercase: " + word.toUpperCase());
        System.out.println("Lowecase: " + word.toLowerCase());
        System.out.println("First char: " + word.charAt(0));
        System.out.println("Last char: " + word.charAt(word.length()-1));
        System.out.println("Substring: " + word.substring(1, 5));
        
    }


    }
