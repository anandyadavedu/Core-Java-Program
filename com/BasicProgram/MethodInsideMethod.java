package com.BasicProgram;

public class MethodInsideMethod {
    public static void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);

        // here we can't make a another method inside the method
        /*
         * public void mul() {
         * System.out.println("Anand");
         * 
         * }
         */
    }

    public static void main(String[] args) {
        sum(5, 06);

    }
}
