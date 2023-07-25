package GenaralProgram;

public class ModuloDivision {
    public static void main(String[] args) {

        // both operand are positive
        System.out.println(12 % 5);

        // first operand are negative
        // sign of result is sign of first operand always
        System.out.println(-12 % 5);

        // second operand are negative
        // result sign depend upon first operand
        System.out.println(12 % -5); // mathematically result is -2
        // but here result is 2
    }
}
