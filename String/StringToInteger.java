package String;

public class StringToInteger {
    public static void main(String[] args) {
        // take a String variable and store only integer value
        // we can't take any other literal (string,float ,array ,double,etc.) except
        // integer
        String s = "100";
        int i = Integer.valueOf(s);
        System.out.println(i);
    }
}
