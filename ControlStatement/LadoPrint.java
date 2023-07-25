package ControlStatement;

//In this program we want to 
//print a beautiful name-->> LADO

public class LadoPrint {
    public static void main(String[] args) {

        System.out.println("LADO MY JAAN THIS IS FOR YOU:");
        System.out.println();
        System.out.println("LADO MY JAAN I LOVE YOU FOREVER:");
        System.out.println();

        int rows = 5;
        int colm = 3;

        // We wnat to print my beautiful love nick name--->>>LADO

        // Code for print " -->>L"
        // Code for print " -->>L"

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= colm; j++) {
                if (j == 1) {
                    System.out.print("*");

                }

                else if (i == 5 && j > 1) {
                    System.out.print(" * * *");
                    break;
                } else {
                    break;
                }
            }
            System.out.println();

        }
        System.out.println();

        // Code for print "-->>A"
        // Code for print "-->>A"

        for (int i = 1; i <= rows; i++) {

            // this for loop for outer space at the word "-->>A"
            for (int j = 1; j <= 2; j++) {
                if (i == 1) {
                    System.out.print(" ");
                } else {
                    break;
                }
            }
            // print outer Astric of "A"
            if (i == 1) {
                System.out.print("* *");
            }
            // these are the code for making proper "A"
            else if (i == 3) {
                for (int j = 1; j <= colm + 1; j++) {
                    System.out.print("* ");
                }

            } else {
                for (int j = 1; j <= colm - 1; j++) {
                    System.out.print("*     ");

                }

            }
            System.out.println();

        }
        System.out.println();

        // Code for print "-->> D"
        // Code for print "-->> D"

        for (int i = 1; i <= rows; i++) {

            if (i == 1 || i == 5) {
                for (int j = 1; j <= colm; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                for (int j = 1; j <= colm - 1; j++) {
                    System.out.print("*     ");
                }
                System.out.println();
            }
        }
        System.out.println();

        // code fpr print"-->> O"
        // code fpr print"-->> O"

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2; j++) {
                if (i == 1 || i == 5) {
                    System.out.print(" ");

                } else {
                    break;
                }
            }
            if (i == 1 || i == 5) {
                for (int k = 1; k <= 2; k++) {
                    System.out.print("* ");
                }

            } else {
                for (int k = 1; k <= 2; k++) {
                    System.out.print("*     ");
                }
            }
            System.out.println();
        }
    }

}
