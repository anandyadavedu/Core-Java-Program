package ThisKeyword;

public class WithThisKeyword {
    int roll_no;
    String name;

    // define constructer
    WithThisKeyword(int roll_no, String name) {
        // there is used this keyword
        // b/c formal argument and instance variable are same
        // if both are diffrent then don't need to this keyword
        this.roll_no = roll_no;
        this.name = name;
    }

    void display() {
        System.out.println(roll_no + " " + name);
    }
}

class TestThis2 {
    public static void main(String[] args) {

        // creating object with value initialization
        WithThisKeyword S1 = new WithThisKeyword(07, "Anand");
        WithThisKeyword S2 = new WithThisKeyword(22, "Lado");

        S1.display();
        S2.display();
    }
}