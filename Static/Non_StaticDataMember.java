package Static;

public class Non_StaticDataMember {
    // here we defined non Static data member
    // a non static data member or method can't be called through static method
    // int n = 10;
    // defined mmain method which is static
    // but wwe can't call non static method or data member
    // to excuted this we have used to this or final keyword
    // public static void main(String[] args) {
    // print the non static data member
    // but we can't do this
    // System.out.println(n);
    // }

    // here we take the data ,member as a static then this code is run
    static int n = 10;

    public static void main(String[] args) {
        System.out.println(n);
    }
}
