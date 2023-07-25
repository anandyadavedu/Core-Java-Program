package GenaralProgram;

import java.util.*;

public class InputFromKeyboard {
    public static void main(String[] args) {

        // Using System console() class

        System.out.println("Enter the name?");
        String name = System.console().readLine();
        System.out.println("Your name is " + name);

        // Using Scanner class

        Scanner as = new Scanner(System.in);
        System.out.println("Enter ypur name here ");
        String name2 = as.nextLine();
        as.close();

        System.out.println("Your name is " + name2);

        // for printing ASCII value of Character

        System.out.println((int) 'A'); // For ASCII value of A is 65 print
    }
}
