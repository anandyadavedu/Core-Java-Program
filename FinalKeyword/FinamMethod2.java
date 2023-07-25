package FinalKeyword;

public class FinamMethod2 {
    final void display() {
        System.out.println("This is the final method ");

    }
}

class Second extends FinalMethod {

    // here we want to overriding the method
    // but we can't do this
    // final void display() {
    // System.out.println("There is overriding in method ");
    // }
}

class test {

    public static void main(String[] args) {

        Second obj = new Second();

        obj.display();
    }
}
