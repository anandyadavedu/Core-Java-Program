package GenaralProgram;

public class AccessVariable2 {
    // instance variable
    int n = 18;

    // static variable
    static int s = 05;

    // create method and return a value
    int method() {
        int c = n + s;
        return c;

    }

    // create a another method and want to
    // access the varable c which is define
    // in another method
    // but it can't possible
    void method2() {
        // System.out.println(c);
    }

    public static void main(String[] args) {

        // local variable
        String name = "Anand";

        // object created
        AccessVariable2 obj = new AccessVariable2();

        // called the method first
        obj.method();

        // calleds the second method
        // but here
        // Exception in thread "main" java.lang.Error:
        obj.method2();

        System.out.println("name is " + name);

    }
}
