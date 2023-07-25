
import java.util.*;

public class FormatSpecifier {
    public static void main(String[] args) {

        // creating object for Formatter class
        Formatter formatter = new Formatter();

        formatter.format("%d", -111);
        System.out.println(formatter); //

        formatter = new Formatter();

        formatter.format("%d", 111);
        System.out.println(formatter);
        System.out.printf("%d", -111);

    }
}
