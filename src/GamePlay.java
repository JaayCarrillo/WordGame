import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        System.out.println("Would you like to enter a last name? ");

        if(input.equals("yes")){
            System.out.println("enter last name: ");
            String lastName = scanner.nextLine();
            Person person = new Person(input, lastName);
            System.out.println(person);
        }
    }
}