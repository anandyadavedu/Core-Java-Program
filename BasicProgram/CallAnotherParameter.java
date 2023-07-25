package BasicProgram;

public class CallAnotherParameter {
    public static int pro1(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 2;
        System.out.println(pro1(a, 'a'));// 97+2=99
    }

}
