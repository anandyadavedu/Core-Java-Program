package Constructor;

public class No_ArgumentConstructer {
    // take instance variable as private
    private String name;

    // created constructer
    No_ArgumentConstructer() {
        System.out.println("Constructer called");
        name = "Anand";
    }

    public static void main(String[] args) {

        // created object that is called the constructer
        No_ArgumentConstructer obj = new No_ArgumentConstructer();
        // print String
        System.out.println(obj.name);
    }

}
