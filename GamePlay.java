import java.util.Scanner;

public class GamePlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Player One's first name: ");
        String playerOneFirstName = scanner.nextLine();

        System.out.print("Does Player One want to enter a last name? (yes/no): ");
        String playerOneLastNameChoice = scanner.nextLine();
        String playerOneLastName = "";
        if (playerOneLastNameChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Player One's last name: ");
            playerOneLastName = scanner.nextLine();
        }

        System.out.print("Enter Player Two's first name: ");
        String playerTwoFirstName = scanner.nextLine();

        System.out.print("Does Player Two want to enter a last name? (yes/no): ");
        String playerTwoLastNameChoice = scanner.nextLine();
        String playerTwoLastName = "";
        if (playerTwoLastNameChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Player Two's last name: ");
            playerTwoLastName = scanner.nextLine();
        }

        System.out.print("Enter Player Three's first name: ");
        String playerThreeFirstName = scanner.nextLine();

        System.out.print("Does Player Three want to enter a last name? (yes/no): ");
        String playerThreeLastNameChoice = scanner.nextLine();
        String playerThreeLastName = "";
        if (playerThreeLastNameChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Player Three's last name: ");
            playerThreeLastName = scanner.nextLine();
        }

        Host host = new Host("Game Show Host");
        host.displayHostInfo();

        PlayerOne playerOne = new PlayerOne(playerOneFirstName, playerOneLastName);
        playerOne.playGame(host);

        PlayerTwo playerTwo = new PlayerTwo(playerTwoFirstName, playerTwoLastName);
        playerTwo.playGame(host);

        PlayerThree playerThree = new PlayerThree(playerThreeFirstName, playerThreeLastName);
        playerThree.playGame(host);

        System.out.print("Do you want to play another game? (yes/no): ");
        String playAgain = scanner.nextLine();
        if (playAgain.equalsIgnoreCase("yes")) {
            main(args); // Restart the game
        } else {
            System.out.println("Thank you for playing!");
        }
    }
}
