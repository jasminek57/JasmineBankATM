public class Account {
    private int amount;
    public ATM atm;
    public Account checkings;
    public Account(){
        this.amount = 0;
        atm = new ATM();
    }

    public double getAmount(){
        return amount;
    }
     public void updateAmount(String method){
        amount.method();
     }

}
