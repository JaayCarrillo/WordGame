import java.util.Scanner;

public class PlayerThree extends Players{
   public PlayerThree(String firstName, String lastName) {
       super(firstName, lastName);
   }

   @Override
    public void playGame(Host host) {
       Scanner scanner=new Scanner(System.in);
       int guess = scanner.nextInt();

       if (guess != host.getRandomNumber()) {
           System.out.println(firstName + " could have won a playstation!");
           money -= 200; // Decrease money if guess is incorrect
       }

       displayRemainingMoney();
   }
}
