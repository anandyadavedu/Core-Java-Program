package AccessModifier;

// Protected data member and method are accessible 
//in same package and subclass of diffrent packages
public class ProtectedModifier {

    // protected data member declared
    protected int roll_no = 10;
    protected String name = "Lado";

    protected void display() {
        System.out.println(roll_no + " and  " + name);

    }

    public static void main(String[] args) {

        // create object for calling
        ProtectedModifier obj = new ProtectedModifier();

        obj.display();

        // here e can see that protected method and data member
        // are accessible in same class and same packages
    }

}

// extends ProtectedModifier {
// tatic void main(String[] args) {
// reate object for calling
// ectedModifier obj = new ProtectedModifier();
// em.out.println("calling a protected method");
//
// display();
//
//
// }
