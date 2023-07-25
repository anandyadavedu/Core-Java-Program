package GenaralProgram;

public class PrefixPostfix {
    public static void main(String[] args) {
        System.out.println("prefix operation occurs: ");
        int a = 10;
        int b = 11;
        int c = ++a;
        int d = ++b;

        // prefix opertion take place first value increament/decreament

        System.out.println(c + " " + d); // c,d=11,12

        System.out.println("postfix operation occurs: ");
        c = a++; // c=11 & d=12 already here no any changes
        d = b++;

        // postfix operation take place
        // value first value initialized then increament/decreament
        // no any changes in the value when print them
        // but when we again use these variable
        // first of all value is increament/decreament
        // then next operation take place
        System.out.println(c + " " + d); // c=11,d=12

        // here value is changes

        c = a++; // c=12,d=13 because in previous statement value of
        d = b++; // a&b are increament after print them

        System.out.println(c + " " + d); // c=12,d=13
    }
}
