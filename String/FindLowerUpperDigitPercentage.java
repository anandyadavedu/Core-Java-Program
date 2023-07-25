package String;

import java.text.DecimalFormat;

public class FindLowerUpperDigitPercentage {
    static void charPercentage(String input) {
        int totalChar = input.length();
        int upperCase = 0, lowerCase = 0, digits = 0, others = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isDigit(ch)) {
                digits++;

            } else {
                others++;
            }

        }

        double upperCaseLetterPercentage = (upperCase * 100) / totalChar;
        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;
        double digitsPercentage = (digits * 100) / totalChar;
        double othersPercentage = (others * 100) / totalChar;

        DecimalFormat format = new DecimalFormat();
        System.out.println("In " + input + ":");

        System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "% ");
        System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");
        System.out.println("Digits Are " + format.format(digitsPercentage) + "%");
        System.out.println("Other Characters Are " + format.format(othersPercentage) + "%");

    }

    public static void main(String[] args) {
        charPercentage("India is my country 100%");
    }

}
