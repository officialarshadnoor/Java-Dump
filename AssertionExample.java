import java.util.Scanner;

public class AssertionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int value = sc.nextInt();
        assert value >= 18 : "Not valid";

        System.out.println("Value is " + value);
    }
}
