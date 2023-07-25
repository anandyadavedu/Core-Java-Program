package String;

import java.util.*;

public class AnagramSecondMEthod {

    public static boolean anagram2(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        String S1 = a1.replaceAll(" ", "");
        String S2 = b1.replaceAll(" ", "");
        // boolean status=true;
        if (S1.length() != S2.length()) {
            return false;
        } else {
            char[] ch1 = S1.toCharArray();
            char[] ch2 = S2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for (int i = 0; i < ch1.length; i++) {
                if (ch1[i] != ch2[i]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void main(String[] args) {
        boolean status = anagram2("Anand", "Danan");
        if (status) {
            System.out.println("Anagram");
        } else {
            System.out.println("NOT Anagram");
        }
    }

}
