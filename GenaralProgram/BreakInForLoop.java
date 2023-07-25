package GenaralProgram;

public class BreakInForLoop {
    public static void main(String[] args) {
        int k = 5;
        for (int j = 0; j <= k; j++) {

            for (int i = 0; i <= k; i++) {
                if (i < 4) {
                    System.out.println("HIII");
                } else {
                    break;
                }

            }
        }
    }
}
