package String;

public class ParseIntMethod {
    public static void main(String[] args) {
        String S = "2023";

        // In the parseInt(S) method
        // ONLY Take INTEGER VALUE IN STRING---S
        int integer = Integer.parseInt(S);
        System.out.println(integer);

        float floatNumber = Float.parseFloat(S);
        System.out.println(floatNumber);

        double doubleNumber = Double.parseDouble(S);
        System.out.println(doubleNumber);

    }
}
