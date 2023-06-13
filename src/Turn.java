import java.util.Random;
import java.util.Scanner;

public class Turn {
    private int correctChoice = 200;
    private int incorrectChoice = 100;

    public boolean takeTurn(Players players, Host host) { // accepts parameters
    Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I am your host " + host.getFirstName() + ": " + players.getFirstName() + ", Enter your guess!");

        int guess = scanner.nextInt();
        boolean correctGuess = Numbers.compareNumber(guess);

        if(correctGuess) {
            players.setMoney(players.getMoney() + correctChoice);
            System.out.println("Congratulations" + "" + players.getFirstName() + "! You won $" + " "+ correctChoice);
        }
        else {
            players.setMoney(players.getMoney() - incorrectChoice);
            System.out.println("Im sorry" + " "+ players.getFirstName());
        }
        System.out.println(players.toString());
        return correctGuess;
    }

}
