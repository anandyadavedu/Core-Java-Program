package ClassAndObject;

public class Student_1 {
    String name = "Anand";
    String phone_no = "9889366056";
    String address = "Ghazipur";

}

class Student_2 {
    String name = "Lado";
    String phone_no = "1234567890";
    String address = "Luckmow";

}

class CallBothClass {
    public static void main(String[] args) {

        // create object_1
        Student_1 s1 = new Student_1();

        // create object_2
        Student_2 s2 = new Student_2();

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.phone_no);
        System.out.println(s2.phone_no);
        System.out.println(s1.address);
        System.out.println(s2.address);
    }

}
