package String;

public class ReverseString {
    public static String reversedString(String s) {
        String reversed = "";
        char[] ch = s.toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + ch[i];
        }
        return reversed;
    }

    public static void reverseString2(String str) {
        char[] ch = str.toCharArray();

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }

    public static void reverseString3(String str3) {
        StringBuffer sb = new StringBuffer(str3);
        System.out.println(sb.reverse());

    }

    // if we have passed array of string

    public static void reversedchar(char[] s) {
        int j = 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[s.length - j];
            s[s.length - j] = s[i];
            s[i] = temp;
            j++;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }

    public static String rev(String Str, int k) {

        char[] ch = Str.toCharArray();
        int len = ch.length;
        int start = 0;
        int end = k - 1;
        while (len > 0) {

            for (int i = start; i < end && start < end; i++) {
                char temp = ch[i];
                ch[i] = ch[end];
                ch[end] = temp;
                k--;

            }
            len = len - 2 * k;
            start = 2 * k;
            end = 2 * k + k - 1;
        }
        String res = String.valueOf(ch);
        return res;
    }

    public static void main(String[] args) {
        // try (Scanner as = new Scanner(System.in)) {

        // System.out.println("Enter the string: ");
        // String hobby = as.nextLine();

        // String words[] = hobby.split("\\s");
        // String reversed = "";

        // for (int i = 0; i < words.length; i++) {
        // if (i == words.length - 1) {
        // reversed = words[i] + reversed;

        // } else {
        // reversed = " " + words[i] + reversed;
        // }

        // }
        // System.out.println("Reversed String are: " + reversed);
        // }
        // String str = "Anand Yadav";
        // String str3 = "Anand Yadav";

        // System.out.println(reversedString("Anand Yadav"));
        // reverseString2(str);
        // reverseString3(str3);

        // char[] s = { 'a', 'b', 'c', 'd', 'e' };
        // reversedchar(s);

        System.out.print(rev("abcdefg", 2));

    }

}
