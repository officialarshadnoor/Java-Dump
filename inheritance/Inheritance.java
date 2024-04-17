package inheritance;

class Human {
    int age;

    void sleep() {
        age = 19;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student extends Human {

}

public class Inheritance {
    public static void main(String[] args) {

        Student st = new Student();
        st.sleep();
    }
}
