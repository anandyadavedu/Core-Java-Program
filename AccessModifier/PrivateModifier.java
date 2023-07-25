
package AccessModifier;

//Private method and datamember are accessible 
//in same class only
public class PrivateModifier {

    // private datamember defined
    private int rollno = 10;
    private String name = "Anand";

    // private method is defined
    private void method(int a, String n) {
        rollno = a;
        name = n;
        System.out.println("name is " + name + " roll number is  " + rollno);
    }

    public static void main(String[] args) {

        // object is created for calling a non static method
        PrivateModifier obj = new PrivateModifier();

        // calling the method
        obj.method(07, "Anand");

    }
}
// Here if we want to try to access private data member in another class then we
// can't do this
