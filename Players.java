public abstract class Players {
    public String firstName;
    public String lastName;
    public int money;

    public Players(String firstName, String lastName) {
        this.firstName= firstName;
        this.lastName=lastName;
        this.money=1000;
    }

    public abstract void playGame(Host host);

    public void displayRemainingMoney() {
        System.out.println(firstName + " " + lastName + " " + "," + "remaining money:" + money );
    }
}
