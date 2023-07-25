package String;

import java.util.Scanner;

public class RemoveWhitespaceFromString {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = as.nextLine();
        as.close();

        // using build-in method
        String noSpaceStr = str.replaceAll("\\s", "");
        System.out.println(noSpaceStr);

    }
}
