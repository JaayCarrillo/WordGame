public class Players extends Person{
    private double pMoney; // variables
   // constructors //
    public Players() {
        super();
        this.pMoney = 1000.00;
    }

    public double getpMoney() {
        return pMoney;
    }

    public void setpMoney(double pMoney) {
        this.pMoney = pMoney;
    }

@Override
    public String toString(){
        return String.valueOf(getpMoney());
    }
}
