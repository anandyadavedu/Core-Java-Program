package method;

public class StaticTest {
    // here we can only pass the static variables
    // if non static variables take then error occurs
    static int a = 4;

    public static void main(String[] args) {
        System.out.println(a);
    }

}
