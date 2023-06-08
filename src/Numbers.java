import java.util.Random;
public class Numbers {
    private static int randomNum;

    public static int getRandomNum() {
        return randomNum;
    }

    public static void setRandomNum(int randomNum) {
        Numbers.randomNum = randomNum;
    }
    public int generateNumber(Random random) {
        random.nextInt(1000);

        return 0;
    }


    public boolean compareNumber(int guess){
        if (guess == randomNum){
            Players player = new Players("", "", 1000);
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