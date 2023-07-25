package AccessModifier;

class DefaultModifier {
    void display() {
        System.err.println("This is massage:");

    }
}

class Test {
    public static void main(String[] args) {
        DefaultModifier obj = new DefaultModifier();
        obj.display();
        System.out.println("this is the another class method:");

    }

}
