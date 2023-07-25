package Recursion;

public class PrintPowFunction {
    public static int power(int x, int n) {
        if (n == 0 || x == 0) {
            return 1;
        }
        int xm1 = power(x, n - 1);
        int xn = x * xm1;
        return xn;

    }

    public static void main(String[] args) {
        int x = 5, n = 4;
        int ans = power(x, n);
        System.out.println(ans);
    }
}
