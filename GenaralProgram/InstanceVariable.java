package GenaralProgram;

public class InstanceVariable {
    int a = 10;

    public static void main(String args[]) {
        InstanceVariable obj1 = new InstanceVariable();
        InstanceVariable obj2 = new InstanceVariable();
        System.out.println("obj1.a" + obj1.a);
        System.out.println("obj2.a" + obj2.a);
    }
}
