public class Players extends Person{
    private int money;

    public Players(String firstName) {
        super(firstName);
    }

    public Players(String firstName, String lastName, int money) {
        super(firstName, lastName);
        this.money = 1000;
    }

    public Players(String firstName, int money) {
        super(firstName);
        this.money = 1000;
    }


    // we created a players constructor that takes 'firstName' && 'lastName'
    // as parameters and used a super() method to extend the 'Person' class



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
        return getFirstName() + " " + getLastName()+ ", Money: $" + money;
    }


}
