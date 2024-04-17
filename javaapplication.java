class ab extends Exception {

}

public class javaapplication {

    public static void validate(int age) {
        if (age < 18) {
            // throw Arithmetic exception if not eligible to vote
            try {
                throw new ab();
            } catch (ab e) {
                System.out.println("This age is not allowed");
            }
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }

    // main method
    public static void main(String[] args) {
        // calling the function
        validate(18);
        System.out.println("rest of the code....");
    }
}
