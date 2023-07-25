package method;

public class TestMethod {
    int h;
    int b;
    int res;

    public float areaOfTriangle(int h, int b) {
        this.h = h;
        this.b = b;
        float res = (1 / 2) * h * b; // formula to calculate Triangle's area
        return res;
    }
}

class Test {

    public static void main(String[] args) {
        // create object
        TestMethod tm = new TestMethod();

        // store return value in a variable res
        float result = tm.areaOfTriangle(5, 2);
        System.out.println(result);
    }
}
