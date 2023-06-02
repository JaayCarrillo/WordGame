import java.util.Random;

public class Host extends Person{
    /*
    Below is our host constructor that takes in Parent Class 'Person' firstName && lastName as paramaters
     */
    public Host(String firstName, String lastName){
        // we have our super() method to call our extended class 'Person'
        super(firstName, lastName);
    }

    /*
    1. Create a public method called randomizeNum()
    2. this method should instantiates the 'Numbers.java' class
    3. & generates a random number
     */

    public void randomizeNum() {
        Numbers numbers = new Numbers(); // instantiated the numbers class
        Random random = new Random(); // instantiates the random

        int randomNumber = random.nextInt(100); // we set our random number value to '100'
    }
}
