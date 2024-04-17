public class Human1 {
    private String name;
    int age;

    Human1() {
        System.out.println("Human class constructor ");
    }

    void sleep() {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1 {
    void disp() {
        System.out.println("The age is " + age);
    }
}

public class inh {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.sleep();
    }
}