package Constructor;

// first class is created
public class DefaltConstructer {
    int num;
    String name;

    // creating a default constructer with no argument
    DefaltConstructer() {

        System.err.println("Anand is a good coder");

    }
}

// second class is creating
class Anand {
    public static void main(String[] args) {

        // if we want to access the reference variablein there
        // then we can't do this

        // num=10;
        // name="anand";

        // calling default constructer by making object of the first class
        DefaltConstructer lado = new DefaltConstructer();

        // a Non static reference can not access
        // in static reference without object
        lado.num = 10;
        lado.name = "Anand";

        // print the VARIABLE
        System.out.println(lado.name);
        System.out.println(lado.num);
    }
}
