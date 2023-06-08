import java.util.Random;

public class Host extends Person{
    private int randomNumber;
    /*
    Below is our host constructor that takes in Parent Class 'Person' firstName && lastName as paramaters
     */
    public Host(String firstName, String lastName){
        // we have our super() method to call our extended class 'Person'
        super(firstName, lastName);
    }

    /*
    1. Create a public method called randomizeNum()
    2. this method should the 'Numbers.java' class
    3. & generates a random number
     */

    public void randomizeNum() {
       Numbers number = new Numbers();
       Random random = new Random();
       int randomNumber;
       randomNumber = number.generateNumber(random);
    }

}
