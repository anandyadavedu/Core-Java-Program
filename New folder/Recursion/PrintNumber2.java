package Recursion;

public class PrintNumber2 {
    public static void printNumb(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNumb(n - 1);
    }

    public static void main(String[] args) {
        int n = 50;
        printNumb(n);
    }
}
