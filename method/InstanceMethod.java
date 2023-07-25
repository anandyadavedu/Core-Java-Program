package method;

public class InstanceMethod {
    public static void main(String[] args) {

        // define a object due to
        // called a instance method
        InstanceMethod obj = new InstanceMethod();

        // calling a instance method through object
        System.out.println("The sum is " + obj.add(12, 13));
    }

    // int s;
    // user define method
    int add(int a, int b) {
        int s;
        s = a + b;
        return s;
    }
}
