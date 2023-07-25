package String;

public class SwapStringWithoutthirdVariable {
    public static void main(String[] args) {

        String a = "Anand";// here length od a is 5.
        String b = "Babu";// here length of b is 4.
        System.out.println("Before swapping: " + a + " " + b);

        a = a + b;// here length of a is 9.

        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("After swapping : " + a + " " + b);

    }

}
