package Inheritance;

// declare first class 
class One {
    public void method_1() {
        System.out.println("Anand");
    }
}

// inherit the first class in Second class

class Two extends One {
    public void method_2() {
        System.out.println("Kumar");
    }
}

// inherit the second class in third class
class Three extends Two {
    public void method_3() {
        System.out.println("Yadav");
    }
}
// this is the last class in which we create main method
// class which is same name as filename that cl;ass
// are always used public modifier

public class MultilevelInheritance {
    public static void main(String[] args) {
        // create object for the method call
        // during the inheritance only subclass object
        // are created not for SUPERCLASS object is created
        Three obj = new Three();

        // calling the method
        obj.method_1();// Anand
        obj.method_2();// Kumar
        obj.method_3();// Yadav
    }

}
