import java.util.Random;
public class Numbers {
    private int randomNum;

    public int getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }
    public generateNumber() {
        /*int min = 0;
        int max = 100;

        int random = (int)Math.floor(Math.random() * (max-min + 1) + min);
        int random = randomNum;
        System.out.println(random);

        int random = randomNum.nextInt(100);

         */

        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);
    }
}