public class Players extends Person{
    private int money;

    public Players(String firstName) {
        super(firstName);
        this.money = 1000;
    }







    /*
    Our getters and setters for our money value is set
     */
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    /*
    we will add our toString() method here:
     */

    @Override
    public String toString() {

        return getFirstName() + " " + getLastName()+ " Money: $" + ""+ money;
    }


}
