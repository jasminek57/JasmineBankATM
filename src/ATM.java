public class ATM {

    public ATM() {
    }
    public double withdraw(double account, double amount){
        return account -= amount;
    }

    public double deposit(double account, double amount){
        return account += amount;
    }

    public double transferPtOne(double transferring, double transfer){
        return transferring -= transfer;
    }

    public double transferPtTwo(double getTransfer, double transfer){
        return getTransfer += transfer;
    }


}
