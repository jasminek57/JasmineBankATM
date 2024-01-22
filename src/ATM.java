public class ATM {
    // sll stm functions will be here
    public int numA;
    public int numS;
    public String receipt;
    public ATM() {
        receipt = "--------------------" +
                "\n      Receipt       " +
                "\n\n";
        numA = 0;
        numS = 0;
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
    public String ID(int option){
        String ID = "";
        String start = "";
        int endNum = 0;
        if (option <= 3){
            endNum = numA;
            numA++;
            start = "A";
        } else {
            endNum = numS;
            numS++;
            start ="S";
        }
        String num = "";
        if (endNum < 10){
            num = "000";
        } else if(endNum < 100){
            num ="00";
        } else if(endNum < 1000){
            num ="0";
        }

        return start + num + endNum;
    }

    public void updateReceipt(String message){
        receipt = receipt + message + "\n\n";
    }
}
