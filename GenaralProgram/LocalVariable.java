package GenaralProgram;

public class LocalVariable {

    public static void main(String args[]) {
        System.out.println("in main");
        LocalVariable obj = new LocalVariable();
        obj.m1();
        obj.m2();
    }

    void m1() {
        int a = 10;
        System.out.println("a=" + a);
    }

    void m2() {
        // we can't access the local variable in out of block
        // System.out.println("a=" + a);
    }
}
