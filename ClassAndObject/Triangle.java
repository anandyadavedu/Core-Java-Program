package ClassAndObject;

public class Triangle {
    int a, b, c;

    public double Area() {
        double s = (a + b + c) / 2.0;
        return Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);

    }

    public int parameter() {
        int p = a + b + c;
        return p;

    }

    public static void main(String[] args) {
        // Scanner as = new Scanner(System.in);

        // System.out.println("Enter the first side of traingle: ");
        // int a = as.nextInt();
        // System.out.println("Enter the second side of traingle: ");
        // int b = as.nextInt();
        // System.out.println("Enter the third side of traingle: ");
        // int c = as.nextInt();
        // as.close();

        // create a object

        Triangle t = new Triangle();
        t.a = 2;
        t.b = 5;
        t.c = 6;
        // call the method
        System.out.println("Area of triangle are: " + t.Area());
        System.out.println("Parameter of triangle are: " + t.parameter());

    }
}
