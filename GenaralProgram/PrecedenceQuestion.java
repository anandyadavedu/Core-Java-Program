package GenaralProgram;

public class PrecedenceQuestion {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        // postfix operation occurs no any changes
        // in initial value at print time
        // after the print them value is increament
        int d = a + b++ + c++;

        System.out.println(d);

        int e = a++ * ++a * ++b * b++ + c++ - ++c;
        System.out.println(e);

    }
}
