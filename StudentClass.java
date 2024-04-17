public class StudentClass {
    public static class Student {
        String name;
        int rno;
        double percent;

        Student() {
            this.name = name;
            this.rno = rno;
            this.percent = percent;
        }
    }

    public static void fun(String n) {
        System.out.println(n);
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Arshad";
        x.rno = 76;
        x.percent = 92.5;

        String name = "Arshad";
        fun(name);

        // System.out.println(x.name);
        // System.out.println(x.rno);
    }
}