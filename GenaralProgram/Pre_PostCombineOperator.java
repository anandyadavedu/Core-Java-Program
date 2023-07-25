package GenaralProgram;

public class Pre_PostCombineOperator {
    public static void main(String[] args) {
        int a = 4;
        // int S1 = a++ + a--; // S1=11
        // int S2 = -a + ++a; // S2=1
        int S3 = a - + ++a - a++; // S3=-7

        System.out.println(S3);

    }
}
