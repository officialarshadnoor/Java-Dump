class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void showAge() {
        System.out.println(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println(name);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setAge(21);
        obj.showAge();
        obj.setName("Rahul");
        obj.showName();
    }
}