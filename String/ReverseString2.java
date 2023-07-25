package String;

//import java.util.Scanner;

public class ReverseString2 {
    // public static void main(String[] args) {
    // try (Scanner as = new Scanner(System.in)) {
    //
    // System.out.println("Enter the String:");
    // String str = as.nextLine();
    //
    // StringBuffer sbr = new StringBuffer(str);
    // sbr.reverse();
    // System.out.println(sbr);
    // }
    // }
    //

    public static void main(String[] args) {
        String str = "Anand loves Lado";

        char[] S1 = str.toCharArray();
        // String rev = "";
        // for (int i = S1.length - 1; i >= 0; i--) {
        // rev = rev + str.charAt(i);

        // }
        // System.out.println(rev);

        for (int i = S1.length - 1; i >= 0; i--) {
            System.out.print(S1[i]);

        }

    }

}
