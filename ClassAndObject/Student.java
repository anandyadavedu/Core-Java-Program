package ClassAndObject;

// defined a public class_1
public class Student {
    String name;
    int roll_no;
}

// defined a class_2
class Ans {
    public static void main(String[] args) {

        // creating an obvject of Student class
        Student s = new Student();

        // Assigning the values of variable:
        s.name = "Anand";
        s.roll_no = 7;
        System.out.println("The name is " + s.name + " and roll_no is " + s.roll_no);

        // creates a local variables
        String name_1 = "Lado";
        int roll_no = 22;
        System.out.println("The name is " + name_1 + " and roll number is " + roll_no);
    }
}
