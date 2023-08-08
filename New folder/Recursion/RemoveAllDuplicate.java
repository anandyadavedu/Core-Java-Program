package Recursion;

import java.util.Scanner;

public class RemoveAllDuplicate {

    // define a recursive method

    public static void duplicate(String str, int i, String newString) {
        // base case generated

        if (i == str.length() - 2) {
            System.out.print("New String are : " + newString);
            return;
        }
        // check the condition

        char a = str.charAt(i);
        if (a == str.charAt(i + 1)) {
            newString += a;

        }
        // call the recursion method
        duplicate(str, i + 1, newString);
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the String which you want to check:");
        String str = as.nextLine();
        as.close();

        // recursive call
        duplicate(str, 0, "");
    }
}
