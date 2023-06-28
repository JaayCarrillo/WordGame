import java.util.Random;

public class Host {
    private String name;
    private int randomNumber;

    public Host(String name){
        this.name=name;
        this.randomNumber = generateRandomNumber();
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }
    public int getRandomNumber() {
        return randomNumber;
    }

    public void displayHostInfo() {
        System.out.println("Host: " + name);
    }
}
