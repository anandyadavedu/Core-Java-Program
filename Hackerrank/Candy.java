
import java.util.Scanner;

public class Candy {

    public static void anand(int N, int M) {
        // int rem=0;
        System.out.println(N + " " + M);
        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");

        }
        return;
        // (N * (N + 1)) % 2 * M;

    }

    public static int lado(int testCase, int N, int M) {
        if (testCase <= 0) {
            return 0;
        } else {
            int rem = (N * (N + 1)) % (2 * M);
            System.out.println("Case #" + testCase + " :" + rem);

        }
        return lado(testCase - 1, N, M);
    }

    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        int testCase = as.nextInt();
        System.out.println(testCase);

        int N = as.nextInt();

        int M = as.nextInt();
        as.close();
        // System.out.println(as.nextInt(N));

        // for (int i = 1; i <= testCase; i++) {
        System.out.println(N + " " + M);
        for (int j = 1; j <= N; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // }
        lado(2, 7, 3);
    }
}
