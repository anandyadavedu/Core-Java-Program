package SuperKeyword;

public class SuperWithConstructer {
    SuperWithConstructer() {
        System.out.println("Base class constructer ");
    }
}

class Another extends SuperWithConstructer {
    Another() {

        // this super method call the base class constructer
        // only for accessed base class constructer
        super();

        System.out.println("This is derived class constructer ");

    }
}

class TestSuperConstructer {
    public static void main(String[] args) {

        // constructer call through object
        Another obj = new Another();
    }
}
