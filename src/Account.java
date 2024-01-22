public class Account {
    private double amount;
    public Account checkings;
    public Account(){
        this.amount = 0;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double newAmount){
        amount = newAmount;
    }

}
