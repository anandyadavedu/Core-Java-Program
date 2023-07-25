package Inheritance;

class Animal {
    // Intance variable are declared
    int age;
    String name;

    // declared a method
    public void eat() {
        System.out.println("Animal can eat");
    }
}

// inherit the Animal clASS in dog class
class Dog extends Animal {

    // we can take any intance variable in subclass or derived class
    String color;

    // declared a method in inherit class
    public void display() {

        System.out.println("The name of dog is " + name + " and age is " + age + " and color is " + color);
    }
}

// this is the main class in which we defined the file name
public class AnimalDog {
    public static void main(String[] args) {

        // create an object to called non static method
        Dog obj = new Dog();

        // iniatialized the variable which is used
        obj.age = 2;
        obj.name = "sheru";
        obj.color = "black";

        // call the method in class
        // we can call any method in inheritaed classes

        obj.eat();
        obj.display();

    }

}
