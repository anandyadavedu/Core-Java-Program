package ControlStatement;

public class Anshika {
    public static void main(String[] args) {
        int rows = 5, colm = 3;

        System.out.println("THIS IS FOR MY LOVELY SISTER #ANSHIKA");
        System.out.println("THIS IS FOR MY LOVELY SISTER #ANSHIKA");
        System.out.println("THIS IS FOR MY LOVELY SISTER #ANSHIKA");

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

        // code for print -->> N

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= rows; j++) {
                if ((i == 0 || i == 4) && (j == 1 || j == 3 || j == 2 || j == 4)) {
                    System.out.print(" ");
                } else if ((i == 0 || i == 4) && (j == 0 || j == 5)) {
                    System.out.print("*");
                } else if (i == 1) {
                    if (j == 0 || j == 2 || j == 5) {
                        System.out.print("*");
                    }

                    else {
                        System.out.print(" ");
                    }

                } else if (i == 2) {
                    if (j == 0 || j == 3 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 3) {
                    if (j == 0 || j == 4 || j == 5) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();

        }
        System.out.println();

        // code for print -->> S

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 0 || i == 2 || i == 4) {
                    System.out.print("*");
                } else if (i == 1) {
                    if (j == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                } else if (i == 3) {
                    if (j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();

        // code for print -->> H

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == 2) {
                    System.out.print("*");
                } else {
                    if (j == 0 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }
        System.out.println();

        // code for print --->> I

        for (int i = 0; i < rows; i++) {
            System.out.print("  *");
            System.out.println();

        }
        System.out.println();

        // code for print -->> K alphabet

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i == 4) {
                    if (j == 0 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == 1 || i == 3) {
                    if (j == 3 || j == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 0 || j == 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();

        }

        System.out.println();

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

    }
}
