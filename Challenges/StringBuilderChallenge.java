
package Challenges;

 import java.util.Scanner;

public class StringBuilderChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scan.nextLine());
        System.out.println("Please enter message: ");

       // String string = message;
        scan.close();

       // String name = args [0];

        System.out.println("Length "+ message.length());
        System.out.println("First char: " + message.charAt(0));
        System.out.println("Last char: " + message.substring(message.length()-1));
        System.out.println("Occurance of a " + message.indexOf("a"));
        System.out.println("Print the index 3 to 6" + message.substring(3,6));
        message.append(123);
        message.insert( 4, "xyz");
        message.delete(2,4);
        message.deleteCharAt(8);
        System.out.println("This is the final string " + message.reverse());



    }

}
