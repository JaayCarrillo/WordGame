public class Players extends Person{
    private int money;


    // we created a players constructor that takes 'firstName' && 'lastName'
    // as parameters and used a super() method to extend the 'Person' class
    public Players(String firstName, String lastName){
        super(firstName, lastName);
        money = 1000; // our value of money is set to 1000
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
        return getFirstName() + " " + getLastName()+ ", Money: $" + money;
    }
}
