package Constructor;

// constructer overloading means more than one constructer created with diffrent parameter 
public class ConstructerOverloading {
    int id;
    String name;
    int age;

    ConstructerOverloading(int a, String b) {
        id = a;
        name = b;
    }

    ConstructerOverloading(int a, String b, int c) {
        id = a;
        name = b;
        age = c;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        ConstructerOverloading S1 = new ConstructerOverloading(07, "Anand");
        ConstructerOverloading S2 = new ConstructerOverloading(8, "Yadav", 22);

        S1.display();
        S2.display();
    }

}
