public class TestExceptionPropogation {
    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (ArithmeticException e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String[] args) {
        TestExceptionPropogation obj = new TestExceptionPropogation();
        obj.p();
        System.out.println("normal flow...");
    }
}
