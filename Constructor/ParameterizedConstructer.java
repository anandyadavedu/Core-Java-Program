package Constructor;

public class ParameterizedConstructer {
    int id;
    String name;

    // creating a parameter constructer
    ParameterizedConstructer(int i, String n) {
        id = i;
        name = n;
        // if we print any thing in constructer then that is print that time object is
        // creating
        // System.out.println("This is Anand");
    }

    void display() {
        System.out.println("Name is " + name + " and id is " + id);
    }

    public static void main(String[] args) {
        ParameterizedConstructer S1 = new ParameterizedConstructer(19035, "Anand");
        ParameterizedConstructer S2 = new ParameterizedConstructer(19036, "Yadav");

        S1.display();
        S2.display();
    }
}
