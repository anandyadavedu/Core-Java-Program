package ThisKeyword;

public class A {
    int num;
    String name;

    A() {
        this(10, "Lado");
        System.err.println("No Argument constracter");
    }

    A(int num, String name) {
        this.num = num;
        this.name = name;
        System.out.println("Parameterized constractur");
    }

    public static void main(String[] args) {
        A obj = new A();

    }
}
