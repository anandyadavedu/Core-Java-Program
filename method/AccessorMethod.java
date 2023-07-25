package method;

public class AccessorMethod {
    int roll = 10;
    String name = "Anand";

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        AccessorMethod obj = new AccessorMethod();
        System.out.println("Roll number is " + obj.getRoll());
        System.out.println("Roll number is " + obj.getName());

    }
}
