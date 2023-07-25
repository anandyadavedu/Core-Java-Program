package FinalKeyword;

final class FinalClass {
    public void display() {
        System.out.println("This is the method ");
    }
    // }

    // here we want to inherit final class in another class
    // but we can't do this
    // final class prevent the inheritance

    // class Second extends FinalClass {

    public static void main(String[] args) {
        Second obj = new Second();

        obj.display();

    }
}
