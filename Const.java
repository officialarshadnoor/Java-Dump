class Student {
    private String name;
    private int roll;

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    String getName() {
        return name;
    }
}

public class Const {
    public static void main(String[] args) {
        Student obj = new Student("Ariba", 15);
        System.out.println(obj.getName());
    }
}
