package Inheritance;

// Defined SUPER CLASS as A named 
class A {
    void print_A() {
        System.out.println("CLASS A");
    }
}

// class B defined with inherit the class A
class B extends A {
    void print_B() {
        System.out.println("CLASS B");
    }
}

// defined class C with inherit the class A
class C extends A {
    void print_C() {
        System.out.println("CLASS C");

    }
}

// defined class D inherit with super class (Class A)
class D extends A {
    void print_D() {
        System.out.println("CLASS D");
    }
}

// public method is defined
public class HeirarichalInheritance {
    public static void main(String[] args) {

        System.out.println("object create for class B here only class A and B can be accessed ");
        B obj_B = new B();

        obj_B.print_A();// CLASS A
        obj_B.print_B();// CLASS B

        // can not accessed the these method
        // obj_B.print_D();// error
        // obj.print_C(); //COMPILE TIME ERROR

        // another object creation
        System.out.println("object create for class C here only class A and C can be accessed ");
        C obj_C = new C();

        obj_C.print_A();
        obj_C.print_C();

        // obj_C.print_B();
        // obj_C.print_D();

        System.out.println("object create for class D here only class A and CDcan be accessed ");
        D obj_D = new D();

        obj_D.print_A();
        obj_D.print_D();

        // obj_D.print_B();
        // obj_D.print_C();

    }

}
