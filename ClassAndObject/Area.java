package ClassAndObject;

import java.util.Scanner;

public class Area {
    // non return type method

    public void setDim(int length, int breadth) {
        float area = length * breadth;
        System.out.println(area);
    }

    // return type method
    public float getArea(int length, int breadth) {
        float area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        // taking user input

        Scanner as = new Scanner(System.in);

        System.out.println("Enter the length of rectangle:");
        int n = as.nextInt();

        System.out.println("Enter the breadth of rectangle:");
        int b = as.nextInt();
        as.close();

        // created a object

        Area obj = new Area();

        // calling the methods

        obj.setDim(n, b);
        System.out.println(obj.getArea(n, b));

    }
}
