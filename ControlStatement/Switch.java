package ControlStatement;

public class Switch {
    public static void main(String[] args) {
        int number = 44;
        String size;

        switch (number) {
            case 30:
                size = "small";
                break;
            case 40:
                size = "medium";
                break;
            case 44:
                size = "large";
                break;
            default:
                size = "unknown";
                break;

        }
        System.out.println("size: " + size);

    }

}
