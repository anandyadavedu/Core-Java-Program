package ThisKeyword;

public class ToInvokeCurrentClassConstructer {
    ToInvokeCurrentClassConstructer() {
        System.err.println("Hello Anand");
    }

    ToInvokeCurrentClassConstructer(int x) {
        this();
        System.err.println(x);

    }
}

class TestThis {
    public static void main(String[] args) {
        ToInvokeCurrentClassConstructer obj = new ToInvokeCurrentClassConstructer(07);

    }
}
