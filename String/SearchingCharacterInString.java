package String;

public class SearchingCharacterInString {
    public static void main(String[] args) {

        // Searching index of charecter in String
        // Searching index of charecter in String
        // Searching index of charecter in String

        String str = "Anand Kumar Yadav";

        // 1. indexOf(char c)-->> return index of first Occurence

        int firstindex = str.indexOf('K');
        System.out.println("First Occurence of 'K' is " + firstindex);

        // 2. lastIndexOf() -->>> return index of last occurence

        int lastIndex = str.lastIndexOf('a');
        System.out.println("Last occurence of char 'a' is " + lastIndex);

        // 3. first occurence after the specific index

        int first_in = str.indexOf('a', 5);
        System.out.println("First occurence after the 5th index is " + first_in);

        // 4 Last Occurence after the specific index

        int last_in = str.lastIndexOf('d', 6);
        System.out.println("Last occurence of char 'd' is " + last_in);

        // 5. Give ASCII value of charecter at specific index

        int char_at = str.charAt(8);
        System.out.println("Character at location 8 is  " + char_at);

        // Searching Substring in the String
        // Searching Substring in the String
        // Searching Substring in the String

        String str2 = "Anand Kumar Yadav is a Full Stack Developer";

        int firstIndex = str2.indexOf("Yadav");
        System.out.println("First occurence of subString Yadav " + firstIndex);

        int lastIndexOfSubString = str2.indexOf("is");
        System.out.println("Last Occurence of the substring is " + lastIndexOfSubString);

        // Using contains(CharSequence s) method
        // Using contains(CharSequence s) method
        // Using contains(CharSequence s) method

        String S = "Software";
        CharSequence s = "Soft";
        boolean bool = S.contains(s);
        System.out.println("Found Soft ? " + bool);// return true

        // Matching String Start and End

        System.out.println(str2.startsWith("Anand")); // true
        System.out.println(str2.endsWith("Developer")); // true

    }
}
