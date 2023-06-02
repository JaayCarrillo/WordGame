import java.util.Random;
import java.util.Scanner;

/*
Lesson 1:
 */
public class GamePlay {
    private static Person person;
    private static Players player;
    private boolean gameOver;

    public static void main(String[] args) {

        GamePlay game = new GamePlay();
        game.forName();
        game.forLastName();
        game.createPersonInstance();


        Host host = new Host("Michael", "Scott");
        Players player = new Players();

        System.out.println("I am your host: "+ host.getFirstName() +" "+ host.getLastName());
        System.out.println("Starting $$: " + player.getpMoney()+ ", enter your guess for my random number between 0-100");

        System.out.println(player.getpMoney());
        host.randomizeNum();

        Turn turn = new Turn();


        boolean gameOver = false;

        while(!gameOver){
            gameOver = turn.takeTurn();
        }
        System.out.println(gameOver);






        game.createPlayersInstance();

    Numbers numbers = new Numbers();
    numbers.generateNumber(new Random());

    Scanner scanner = new Scanner(System.in);
    boolean numGuess = false;




    }

    public void gameFinished() {
        Turn turn = new Turn();

        boolean gameOver = false;

        while(!gameOver){
            gameOver = turn.takeTurn();
        }
        System.out.println(gameOver);
    }

    public void playAgain() {
        boolean restartGame = true;

        while(restartGame){
            System.out.println("Do you want to play again? y/n");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            if(choice.equals("n")){
                restartGame = false;
            } else {
                playAgain();
                gameOver = false;
            }
        }
        System.out.println("Thanks for playing!");
    }
    private void forName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        person = new Person(firstName);
    }

    private void forLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to enter a last name? y/n");
        String option = scanner.nextLine();

        if(option.equals("y")) {
            System.out.println("Enter your last name: ");
            String lastName = scanner.nextLine();
            person.setLastName(lastName);
        }
    }

    private void createPersonInstance() {

    }
    private void createPlayersInstance() {

    }

    /*
    Lesson 2: Ends Here
     */

    /*
    Lesson 3: Starts here
    code for Lesson three of working on the Word Game
     */








}