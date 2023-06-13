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
            GamePlay game = new GamePlay();
            game.forLastName();

            System.out.println(firstName + player.getLastName());
            boolean guessedCorrectly = false;
            while(!guessedCorrectly){
                guessedCorrectly = turn.takeTurn(player, host);
            }
            System.out.println(player.toString());
            System.out.println(continuePlay);
        }

    }

    public void forLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to enter a last name? y/n");
        String option = scanner.nextLine();

        if(option.equals("y")) {
            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();
            System.out.println(lastName);
        }
    }
}