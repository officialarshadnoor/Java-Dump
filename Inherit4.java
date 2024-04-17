class Demo1 {
    int a, b;

    public Demo1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parent class constructor");
    }
}

class Demo2 extends Demo1 {
    public Demo2(int a, int b) {
        super(a, b); // Call to parent class constructor
        System.out.println(a + " Child class constructor");
    }
}

public class Inherit4 {
    public static void main(String[] args) {
        Demo2 d = new Demo2(5, 10);

    }
}
