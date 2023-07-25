package BasicProgram;

public class PrefixPostfixOperator {
    public static void main(String[] args) {
        int a = 4, b = 5;

        // Here we operate left to right

        int c = ++a + b++ + --a;
        System.out.println(c);
        int d = a-- + --b + a - ++b;
        System.out.println(d);
    }
}
