public class Transaction {
    public int numA;
    public int numS;

    public String receipt;
    public Transaction(){
        receipt = ConsoleUtility.RED + "-------------------------------------------------" +
                "\nRECEIPT:       " + ConsoleUtility.RESET +
                "\n\n";
        this.numA = 0;
        this.numS = 0;
    }
    public String getReceipt(){
        return receipt;
    }

    public String ID(int option){
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
