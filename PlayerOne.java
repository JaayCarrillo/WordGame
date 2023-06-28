import java.util.Scanner;

public class PlayerOne extends Players{
    public PlayerOne(String firstName,String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void playGame(Host host){
        Scanner scanner = new Scanner(System.in);
        System.out.println(firstName + " " + lastName + ", enter your guess: ");
        int guess = scanner.nextInt();

        if(guess < host.getRandomNumber()) {
            System.out.println("Too Low! " + firstName + "loses money");
            money -= 100;
        } else if(guess == host.getRandomNumber()){
            money += 1000;
        }
        displayRemainingMoney();
    }
}
