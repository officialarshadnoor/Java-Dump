public class Student {
    public String name;
    private int rno;
    double percent;

    final String schoolName = "BBPS";

    Student(String name, int rno, double percent) {
        this.name = name;
        this.rno = rno;
        this.percent = percent;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int roll) {
        rno = roll;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Arshad", 39, 6.5);

        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println(s1.percent);
    }
}
