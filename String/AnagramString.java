package String;

import java.util.*;
import java.util.Arrays;

public class AnagramString {
    public static void anagram(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        String S1 = str1.replaceAll(" ", "");
        String S2 = str2.replaceAll(" ", "");

        boolean status = true;
        if (S1.length() != S2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = S1.toCharArray();
            char[] ArrayS2 = S2.toCharArray();

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.print(S1 + " and " + S2 + " are Anagram");
        } else {
            System.out.print(S1 + " and " + S2 + " are NOT Anagram");
        }

    }

    public static void main(String[] args) {
        try (Scanner as = new Scanner(System.in)) {

            System.out.println("Enter the first String which you want to check :");
            String s1 = as.nextLine();
            System.out.println("Enter the second String which you want to check:");
            String s2 = as.nextLine();
            anagram(s1, s2);
        }
    }
}
