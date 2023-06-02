import java.util.Scanner;

public class Turn {

    boolean takeTurn(){
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        Numbers numbers = new Numbers();
        boolean numGuess = false;

        while(!numGuess){
            System.out.println(person.getFirstName() + ", enter your guess: ");
            int guess = scanner.nextInt();
            numGuess = numbers.compareNumber(guess);
        }
        return numGuess;
    }


}
