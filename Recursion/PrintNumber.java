package Recursion;

public class PrintNumber {

    // define recursive method
    public static void printNumb(int n) {
        // define base condition
        if (n == 51) {
            return;
        }
        // here written the working of program
        System.out.print(n + " ");
        printNumb(n + 1);
    }

    public static void main(String[] args) {
        // initialize the number untill you want to print
        int n = 50;
        System.out.println("print the number from 1 to " + n + " are: ");
        // itself calling
        printNumb(1);
    }

}
