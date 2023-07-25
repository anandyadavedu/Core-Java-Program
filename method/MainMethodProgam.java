package method;

public class MainMethodProgam {
    // Static block that is defined as static
    static {
        System.out.println("static block is executed:");
    }

    // Here we change the main method parameter
    public static void main(String[] x) {

        System.out.println("static method, that is main method executed:");

    }
}
