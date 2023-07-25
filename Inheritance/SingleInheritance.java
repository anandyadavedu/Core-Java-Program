package Inheritance;

// program for single inheritance
//file class always used public modifier
public class SingleInheritance {
    // defined a method
    public void print_anand() {
        System.out.println("Anand");
    }

}

// here inherit the SingleInheritence class through second class
// using extend keyword
class second extends SingleInheritance {
    public void print_dollar() {
        System.out.println("Dollar");
    }
}

// another class in whcih we twst thwe inheritance property
class Test {
    public static void main(String[] args) {

        // create object for calling
        // here inherit class name used in object creation
        second obj = new second();

        // call the method
        obj.print_anand();// Anand
        obj.print_dollar();// Dollar
    }
}