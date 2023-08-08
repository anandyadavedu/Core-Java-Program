package Recursion;

public class SumOfNaturalNumber {

    public static void sumNumber(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.print("Sum of " + n + " natural number is: " + sum);
            return;
        }

        sum += i;
        sumNumber(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int n = 50;
        sumNumber(1, n, 0);
    }
}
