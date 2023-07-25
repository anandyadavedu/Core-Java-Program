package GenaralProgram;

public class BitwiseOR {
    public static void main(String[] args) {

        int num1 = 5; // in binary(0101)
        int num2 = 6; // in banary(0110)
        int result;
        // bitwise OR opertion perform
        // if any binary number is 1 then bitwise OR is 1
        // otherwise 0
        result = num1 | num2;
        System.out.println(result);
    }

}
