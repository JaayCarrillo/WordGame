import java.util.Scanner;

public class GamePlay {
    private static Person person;
    public static void main(String[] args) {
    GamePlay game = new GamePlay();
    game.forName();
    game.forLastName();
    game.createPersonInstance();

    Numbers numbers = new Numbers();
    numbers.generateNumber();

    Scanner scanner = new Scanner(System.in);

    boolean numGuess = false;

    while(!numGuess){
        System.out.println(person.getFirstName() + ", enter your guess: ");
        int guess = scanner.nextInt();
        numGuess = numbers.compareNumber(guess);
    }
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

}