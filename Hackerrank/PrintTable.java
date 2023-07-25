
import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args) {
        Scanner as = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = as.nextInt();
        as.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}
