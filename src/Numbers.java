import java.util.Random;
public class Numbers {
    private static int randomNum;

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }
    public void generateNumber() {

        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);
    }

    public boolean compareNumber(int guess){
        if (guess == randomNum){
            System.out.println("Congratulations, you guess the number!");
            return true;
        }
        if( guess > randomNum){
            System.out.println("I'm sorry. That guess was too high.");
            return false;
        }
        if(guess < randomNum){
            System.out.println("I'm sorry, That guess was too low.");
        }
        return false;
    }
}