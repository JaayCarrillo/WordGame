import java.util.Random;

public class Host extends Person{
    public Host(String firstName) {
        super(firstName);
    }

    public Host(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void randomizeNum() {
        Numbers.generateNumber();
    }

}
