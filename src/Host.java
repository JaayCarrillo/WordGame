import java.util.Random;

public class Host extends Person{
    private int randomNumber;
    public Host() {
    super();

    }

    public void randomizeNum() {

        Numbers numbers = new Numbers();
        Random random = new Random();
        randomNumber=numbers.generateNumber(random);


    }
    public Host(String firstName) {
        super(firstName);
    }

    public Host(String firstName, String lastName) {
        super(firstName, lastName);
    }




}
