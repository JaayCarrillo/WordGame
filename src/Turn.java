import java.util.Random;
import java.util.Scanner;

public class Turn {

    /*
    this class is intended to handle the player's turn
    Steps to accomplish

    1. Create a public method in 'Turn.java' called takeTurn()
     */



    public void takeTurn(Players players, Host host) { // accepts parameters
        System.out.println("It's" + " "+host.getFirstName());
        System.out.println("Enter your guess! 0-100" + " "+players.getFirstName());
    // simulate host by name
        Numbers number = new Numbers();
        number.compareNumber(Numbers.getRandomNum());
        System.out.println(number.generateNumber(new Random()));



    }


}
