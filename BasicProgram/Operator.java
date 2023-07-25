package BasicProgram;

public class Operator {
    public static void main(String[] args) {
        int a = -10, b = 20;
        boolean c = false;
        boolean d = true;
        System.out.println(~a); // ~10 = (-1)-(-10) =9
        System.out.println(~b); // ~20=(-1)-(20)=-21
        System.out.println(!c); // change value true to false
        System.out.println(!d); // not operator

        /*
         * for modulo division , the sign of result is always the sign of the frst
         * operand ( divident)
         * for example a%b=a-(a/b)*b
         * -10%2= -10-(-10/2)*2=
         */
        double dob = (10 * 10 / 2 + 5 - 3 * 4 % 5 - 1); // first multiply then divide then modulo then plus then minus
        System.out.println(dob);
        double dob1 = -10 % 3;
        System.out.println(dob1);

        /*
         * Shift operator
         * for Left shift--->> a<<b = a*2^b
         * 10<<3=10*2^3=80
         * 
         * for Right shift
         * a>>b = a/2^b
         * 20>>2 = 20/2^2=5
         * 
         * 
         */
        System.out.println(10 << 2); // 10*2^2=40
        System.out.println(20 << 3); // 20*2^3=160
        System.out.println(10 >> 2); // 10/2^2=2
        System.out.println(30 >> 3); // 30/2^3=3

        /*
         * Logical Operator amd Bitwise operator
         * && and || -->> Logical AND and Logical OR operator , Check first cond. if
         * true then check second
         * if first cond. is false then not checked second condion
         * 
         * & and | -->> Bitwise AND and Bitwise OR OPerator
         * check both condition in any situation
         */
        int n = 5, m = 6, p = 10;
        System.out.println(n < m && n < p); // first cond. is true then check second also
        System.out.println(n < m || n < p); // first cond. is true then check second also
        System.out.println(m < n && n++ > p); // first condition is false then does not checked second condition
        System.out.println(n); // n=5 remain

        System.out.println(n < m && n++ > p); // here first condition is true then checked second condition also
        System.out.println(n); // n=6 here

        System.out.println(n < m & m++ > p); // here both condition checked so that m is increament
        System.out.println(n < m | m++ > p); // here both condition checked so that m is increament
        System.out.println(m); // m=8 for & then increment by one by OR operator

        /*
         * Ternary operator
         */
        int x = (a < b) ? a : b;
        System.out.println(x);
        int y = 10;
        System.out.println(~y);

    }
}
