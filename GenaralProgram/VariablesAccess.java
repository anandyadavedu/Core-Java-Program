package GenaralProgram;

public class VariablesAccess {
    // declare a instance variable
    int n = 10;
    // declare a static variable
    static int s = 12;

    // created a method
    void display() {
        // here we can access the both variable by this method
        System.out.println(n + " " + s);
    }

    public static void main(String[] args) {

        // declare a local variable
        String name = "Anand";

        // create an object for call the method which is non static
        VariablesAccess obj = new VariablesAccess();

        // called the non static method through object
        obj.display();

        // here we can try to print the local variable
        // local variable and static variable can be access in
        // main method without object
        // but instance variable can't be accessible in main method

        System.out.println(name);

        // here we want to access the
        // instance variable
        // but there is compilation error occur due to
        // non static vaiable accessed in static method

        // System.out.println(n);

    }
}
