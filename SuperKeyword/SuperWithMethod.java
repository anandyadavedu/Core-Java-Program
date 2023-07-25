package SuperKeyword;

public class SuperWithMethod {
    void display() {
        System.out.println("This is Anand ");
    }
}

class Lado extends SuperWithMethod {
    void display() {

        System.out.println("This is Lado class ");

    }

    void msg() {
        System.out.println("Call the current class method ");
        display();

        System.out.println("Call the base class or parent class method with super keyword");
        super.display();
    }
}

class TestSuperMethod {
    public static void main(String[] args) {
        Lado obj = new Lado();

        obj.msg();
    }
}
