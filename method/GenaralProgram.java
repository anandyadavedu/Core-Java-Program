package method;

public class GenaralProgram {
    // defined a method inside class
    void method() {
        int a = 10, b = 20, result;
        result = a * b;
        System.out.println(result);
    }

    public static void main(String[] args) {

        // creating object
        GenaralProgram obj = new GenaralProgram();

        // calling to the method
        obj.method();

        // here if want to try to access result values
        // then we can't do this

        // System.out.println(result);
    }
}
