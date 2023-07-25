package AccessModifier;

//Here class has no modifier so by default its work as
// default class
//here we can take this either public or not
class DefaultAccess2 {

    // create a default method
    void msg() {
        System.out.println("This is the massage");
    }

}
// here second class in same packages
// default class accessible in same packages

class Main {
    public static void main(String[] args) {
        // create an object due to non static
        // method calling thougth the class name
        DefaultAccess2 obj = new DefaultAccess2();
        obj.msg();
    }

}
