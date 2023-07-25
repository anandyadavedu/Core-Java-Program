package Static;

public class Method {
    void display() {
        System.out.println("this is non-static method");
    }

    static void show() {
        System.out.println("This is the Static method");
    }

    public static void main(String[] args) {
        // create a object
        Method obj = new Method();
        // call the non Static method through object
        obj.display();
        // call static method without object
        show();
    }
}
