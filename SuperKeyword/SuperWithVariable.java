package SuperKeyword;

public class SuperWithVariable {

    int maxSpeed = 120;

}

class Second extends SuperWithVariable {
    int maxSpeed = 180;

    void display() {

        // if we don't use the super keyword then
        // it access the derived class data member
        System.out.println("without super keyword output is ");
        System.out.println("Maximum speed is " + maxSpeed); // maxSpeed=180

        // Here super keyword is access the base class data member
        // not the derived class data member
        System.out.println("With super keyword ");
        System.out.println("Maximum speed is " + super.maxSpeed); // maxSpeed=120
    }
}

class Test {
    public static void main(String[] args) {

        Second obj = new Second();

        obj.display();
    }
}
