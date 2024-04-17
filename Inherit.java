class Human { // Super class / Base class / Parent class
    int age;
    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    Human() {
        System.out.println("Human class constrctor");
    }

    void sleep() {
        age = 19;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human { // child class / sub class / derivved class
    Student() {
        super();
        System.out.println("Hello");
    }

    void disp() {
        System.out.println("The age is " + age);
    }

}

public class Inherit {
    public static void main(String[] args) {

        Student st = new Student();
        st.sleep();
        st.disp();
        st.setName("Arshad");
        System.out.println(st.getName());
    }
}
