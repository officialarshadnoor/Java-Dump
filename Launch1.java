import java.util.*;

class Guesser {
    int guessNum;

    int guessingNumber() {
        System.out.println("Guesser! Kindly guess the number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();

        return guessNum;
    }
}

class Player {
    int guessNum;

    int guessingNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! Kidly guess the number");
        guessNum = scan.nextInt();

        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();

    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();

    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            System.out.println("Player 1 won the game");
        } else if (numFromGuesser == numFromPlayer2) {
            System.out.println("Player 2 won the game");
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("No one won the game!!");
        }
    }
}

public class Launch1 {
    public static void main(String[] args) {
        System.out.println("--------------Game Started ---------");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
