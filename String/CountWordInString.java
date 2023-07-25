package String;

import java.util.Scanner;

public class CountWordInString {
    public static int countWord(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        } else {
            // \\s and \\s+ are the whitespace character
            String[] words = str.split("\\s+");
            return words.length;
        }

    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = as.nextLine();
        as.close();

        System.out.println("no of words: " + countWord(str));
    }
}
