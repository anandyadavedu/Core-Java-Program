package FinalKeyword;

public class FinalMethod {

    // defined final method
    // it can be defined only once in program
    public final void display() {

        System.out.println("This is the final method ");
    }

    public static void main(String[] args) {

        // create a object to call final method
        FinalMethod obj = new FinalMethod();

        // print the final method
        obj.display();

    }
}
