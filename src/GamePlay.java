import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    private static Person person;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Host host = new Host("Joseph");
        Turn turn = new Turn();

        boolean continuePlay = true;

        while(continuePlay) {
            host.randomizeNum();

            System.out.println("Enter your first name: ");
            String firstName = scanner.nextLine();
            Players player = new Players(firstName);

            boolean guessedCorrectly = false;
            while(!guessedCorrectly){
                guessedCorrectly = turn.takeTurn(player, host);
            }
            System.out.println(player.toString());
            System.out.println(continuePlay);
        }

    }
}