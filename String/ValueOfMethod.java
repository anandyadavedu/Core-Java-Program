package String;

public class ValueOfMethod {

    public static void main(String[] args) {
        // String S = "Anand";
        int a = 10;
        float f = 10;
        double d = 10.5;
        boolean b = true;

        // String.valueOf() method used to convert Integer,
        // Float,double,Boolean, char Array, value to String

        String S1 = String.valueOf(a);
        System.out.println(S1);// print 10
        System.out.println(S1 + 10);// print 1010

        String S2 = String.valueOf(f);
        System.out.println(S2);

        String S3 = String.valueOf(d);
        System.out.println(S3);

        String S4 = String.valueOf(b);
        System.out.println(S4);

        int ans = Integer.valueOf(a);
        System.out.println(ans);

        int ans1 = Integer.valueOf(S1);
        System.out.println(ans1);
    }

}
