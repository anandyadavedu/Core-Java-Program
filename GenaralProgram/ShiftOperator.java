package GenaralProgram;

public class ShiftOperator {
    public static void main(String[] args) {
        int a = -10, b = 15;
        System.out.println(a << b); // a*2^b
        System.out.println(a << ++b);
        System.out.println(a >> b); /// a/2^b
        System.out.println(a >> ++b);
        System.out.println(a % b);
    }

}
