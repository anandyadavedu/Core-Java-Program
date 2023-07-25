package String;

public class StringCompareMethod {

    public static void equalsMethod() {
        String S1 = "Anand";
        String S2 = new String("Yadav");
        String S3 = "anand";

        System.out.println(S1.equals(S3));// false
        System.out.println(S1.equals(S2));// false
        System.out.println(S2.equals(S3));// false

        // equalsIgnoreCase()
        System.out.println(S1.equalsIgnoreCase(S3));// true

    }

    public static void equalOperator() {
        // equal operator()--->> ==
        String S1 = "Anand";
        String S2 = new String("Anand");
        String S3 = "Anand";
        // == Operator compare reference not value
        // S2 has created another instance in pool
        // S1 and S3 are same reference in pool
        System.out.println(S1 == S2);// false
        System.out.println(S2 == S3);// false
        System.out.println(S1 == S3);// true

    }

    public static void compareToMethod() {
        // It compare value LEXICOGRAPHICALLY
        // return the integer
        // if same the --->> 0
        // If First is less than Second the Retuen --> -1
        // If grater then --->> 1

        String S1 = "Anand";
        String S2 = new String("Anand");
        String S3 = "anand";
        String S5 = "Anand";
        String S4 = "Anand Yadav";

        System.out.println(S1.compareTo(S2));// 0

        System.out.println(S1.compareTo(S3));// -32

        System.out.println(S1.compareTo(S5));// 0

        System.out.println(S1.compareTo(S4));// -6
        System.out.println(S4.compareTo(S1));// 6
        System.out.println(S4.compareTo(S2));// 6
        System.out.println(S2.compareTo(S1));// 0
    }

    public static void main(String[] args) {
        equalsMethod();
        equalOperator();
        compareToMethod();

    }

}
