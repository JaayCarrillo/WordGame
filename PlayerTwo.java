import java.util.Scanner;

public class PlayerTwo extends Players{
    public PlayerTwo(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void playGame(Host host){
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstName + " " + lastName + ", enter your guess ");

        int guess = scanner.nextInt();

        if(guess != host.getRandomNumber()) {
            System.out.println(firstName + " could have won a car!");
            money -= 200;
        }
        displayRemainingMoney();
    }
}
