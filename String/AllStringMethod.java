package String;

public class AllStringMethod {

    // charAt(int index) return the character value of specific index

    public static void allMethodOfString(String name) {
        // Return char at index 2 of name string
        System.out.println("charAt() method--->> ");
        System.out.println(name.charAt(2)); // char value at position 2 in string
        System.out.println();

        // length method return the length of String
        System.out.println("length() method--->> ");
        int length = (name.length());
        System.out.println(length);
        System.out.println();

        // substring of String name
        // return subString of String ahead of index value
        // means Starting point of substring is index define
        System.out.println("Substring() method of beginning index");
        String sub = name.substring(6);
        System.out.println(sub);
        System.out.println();

        // SubString of begining index and endiing index

        System.out.println("SubString of beginning and end index");
        String sub_begin_end = name.substring(0, 11);
        System.out.println(sub_begin_end);
        System.out.println();

        // contains method return true or false
        // after matching the parameter which you provided
        // only same datatype can provide which datatype pass in method
        System.out.println(
                "Contains() method return true or false after checked the given charsequence  is contaions in String");
        boolean charsequence = name.contains("Yadav");
        boolean charsequence2 = name.contains("Kushwaha");
        System.out.println(charsequence);
        System.out.println(charsequence2);
        System.out.println();

        // equals() method -->>
        // It check the equality of String with given object
        // It return true or false
        System.out.println("Equals() method compare the String and return true or false");

        boolean equal = name.equals("Anand Yadav");// true
        boolean equal3 = name.equalsIgnoreCase("anand yadav");// true
        boolean equal2 = name.equals("Shivi Kushawaha");// false
        System.out.println(equal);
        System.out.println(equal2);
        System.out.println(equal3);
        System.out.println();

        // isEmpty() method-->>
        // Checked String is empty or not
        // return type is boolean
        System.out.println("isEmpty() Method ");
        boolean empty = name.isEmpty();
        System.out.println(empty);
        System.out.println();

        // Concat() method-->>
        // return concatneted String
        System.out.println("Concatenation of string ");
        String name2 = " Kumar";
        String concatneted = name.concat(name2);
        System.out.println(concatneted);
        System.out.println();

        // indexOf() method-->>
        // return index of given char sequence in this method
        System.out.println("IndexOf() Method return the index of Given String Or Char");
        String name3 = "Yadav";
        int idx = name.indexOf(name3);
        int idx2 = name.indexOf("Yadav");
        System.out.println(idx);
        System.out.println(idx2);
        System.out.println();

        // toLowerCase() method-->>>
        // toUpperCase() method -->>
        // return in lower-case and Upper case String

        System.out.println("LowerCase and  Uppercase  by toLowerCase() and toUpperCase() method ");
        String lowercase = name.toLowerCase();
        String uppercase = name.toUpperCase();
        System.out.println(lowercase);
        System.out.println(uppercase);
        System.out.println();

        // trim() Method --->>
        // It removes the beginning and ending spaces of string.
        System.out.println("trim() method removed starting and ending space");
        String trimString = " Anand Yadav ";
        String trim = trimString.trim();
        System.out.println(trim);
        System.out.println();

        // replace() method -->>>
        // replace all occurences of specific char value
        // name="Anand Yadav";
        System.out.println(" replace() method rrplace char ans as well as String to new char and String ");

        String replace = name.replaceAll("Anand", "Shivi");// replace "Anand" to "Shivi"
        String replace2 = name.replace('A', 'S');// Replace All 'A' to 'S' Only Capital 'A' replaced
        String replace3 = name.replaceFirst("Y", "A");// Replace FIRST OCCURENCE of "Y" with "A"
        String replace4 = name.replaceFirst("A", "S");// replace only FIRST OCCURENCE of "A" with "S"
        System.out.println(replace); // Shivi Yadav
        System.out.println(replace2); // Snand Yadav
        System.out.println(replace3);// Anand Aadav
        System.out.println(replace4);// Snand Yadav
        System.out.println();

        // startWith() And endWith() method--->>
        // check the String Startwith charecter and endWithcharecter
        // String name="Anand Yadav"

        System.out.println("startsWith and endsWith() method return boolean by comparing string ");
        System.out.println(name.startsWith("A"));// true
        System.out.println(name.startsWith("Y"));// false
        System.out.println(name.endsWith("d"));// false
        System.out.println(name.endsWith("v"));// true
        System.out.println();

    }

    public static void compareTo() {
        String S1 = "Sachin";
        String S2 = "sachin";
        String S3 = new String("Sachin");
        String S4 = "Anand";

        System.out.println("equals() method--->>");

        System.out.println(S1.equals(S2));// true
        System.out.println(S3.equals(S2));// false
        System.out.println(S1.equals(S4));// false

        System.out.println(S1.equalsIgnoreCase(S2));// true
        System.out.println(S1.equalsIgnoreCase(S3));// true
        System.out.println(S1.equalsIgnoreCase(S4));// false
        System.out.println();

        System.out.println("== Operator ");
        System.out.println("Compare REFERENCES NOT VALUE");
        System.out.println(S1 == S2);// false
        System.out.println(S1 == S3);// false (Here new keyword make a new references )
        System.out.println(S1 == S4);// false
        System.out.println();

        System.out.println("compareTo() method -->> compare value lexicographically");
        System.out.println(
                " If same then return --> 0  if less than return -->>negative If greater than return-->> positive ");
        String S5 = "Lado";
        System.out.println(S1.compareTo(S2));// -32
        System.out.println(S1.compareTo(S3));// 0
        System.out.println(S1.compareTo(S5));// positive
        System.out.println(S5.compareTo(S3));// negative
        System.out.println();

        System.out.println(S1.compareToIgnoreCase(S2));
        System.out.println(S1.compareToIgnoreCase(S3));
        System.out.println(S1.compareToIgnoreCase(S5));
        // System.out.println(S1.compareToIgnoreCase(S5));
    }

    public static void concatnetion() {
        System.out.println("Concatenation By + operator and concat() method");
        String S = "Anand" + " Yadav";
        System.out.println(S);

        String S1 = 20 + 30 + "Anand" + 30 + 50;
        // after the String literal All + sign take as concat() method
        System.out.println(S1);// 50Anand3050 is the Output

        System.out.println();

        String S2 = "Lado ";
        String S3 = "Kushwaha";

        System.out.println(S2.concat(S3));
    }

    public static void main(String[] args) {
        String name = "Anand Yadav";
        // char[] ch = { 's', 't', 'r', 'i', 'n', 'g' };
        // String s = new String("Shivi Kushawaha");

        allMethodOfString(name);
        compareTo();
        concatnetion();

    }

}
