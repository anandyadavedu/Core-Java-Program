package Static;

public class StaticVariable {
    // defined instance variable roll_no and name take as normal variable
    // b/c they are different for different Student
    int roll_no;
    String name;

    // college name is th aken as Static b/c its can't changes , its unique for all
    // Student
    // so that take less memory space
    static String college = "RITM";

    // create a constructer
    StaticVariable(int r, String n) {
        roll_no = r;
        name = n;

    }

    // defined display method for print
    void display() {
        System.out.println(roll_no + " " + name + " " + college);
    }

}

// create a another class
class TestStaticVariable {
    public static void main(String[] args) {
        // create object
        StaticVariable obj1 = new StaticVariable(7, "Anand");
        StaticVariable obj2 = new StaticVariable(8, "Lado");
        obj1.display();
        obj2.display();
    }

}