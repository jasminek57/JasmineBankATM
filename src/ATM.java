public class ATM {
    // sll stm functions will be here
    public ATM() {}
    public void withdraw(double account, double amount){
        account -= amount;
    }

    public void deposit(double account, double amount){
        account += amount;
    }

    public void transfer(Account transferring, Account getTransfer, double transfer){
        transferring.amount -= transfer;
        getTransfer.amount += transfer;
    }
}
