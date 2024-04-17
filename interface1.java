interface A {
    void show();
}

interface X {
    void abc();
}

class B implements A, X {
    public void show() {
        System.out.println("Swoing ");
    }

    public void abc() {
        System.out.println("ABC");

    }
}

public class interface1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.abc();
    }
}
