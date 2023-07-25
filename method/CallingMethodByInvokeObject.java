package method;

public class CallingMethodByInvokeObject {
    public int multiply(int a, int b, int c) {
        int results = a * b * c;
        return results;

    }

    public static void main(String[] args) {
        // object creation
        CallingMethodByInvokeObject abc = new CallingMethodByInvokeObject();
        // calling method
        System.out.println(abc.multiply(20, 10, 25));

    }

}
