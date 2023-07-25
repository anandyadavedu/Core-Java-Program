package ThisKeyword;

public class ToInvokeCurrentClassMethod {
    void m() {
        System.out.println("Anand is good coder");
    }

    void n() {
        System.out.println("Lado is good coder");

        // here we have option to used
        // this or not if not used then
        // compiler is automatically considered as this.m();
        this.m();
    }

    public static void main(String[] args) {
        new ToInvokeCurrentClassMethod().n();
    }

}
