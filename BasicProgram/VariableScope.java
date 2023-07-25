package BasicProgram;

public class VariableScope {
    int a = 10;
    static int b = 15;

    public static void main(String[] args) {
        int c = 20;
        // Here a is non static variable so that we can't access in static block

        // System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
